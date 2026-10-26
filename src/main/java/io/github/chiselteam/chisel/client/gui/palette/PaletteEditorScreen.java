package io.github.chiselteam.chisel.client.gui.palette;

import io.github.chiselteam.chisel.network.DeletePalettePacket;
import io.github.chiselteam.chisel.network.PaletteSaveResultPacket;
import io.github.chiselteam.chisel.network.SavePalettePacket;
import io.github.chiselteam.chisel.palette.PaletteDefinition;
import io.github.chiselteam.chisel.palette.PlayerPalette;
import io.github.chiselteam.chisel.palette.PlayerPaletteManager;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.ConfirmScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public final class PaletteEditorScreen extends Screen {
    private final Screen parent;
    private final PaletteDraft draft;
    private final PaletteBlockPicker picker;
    private Map<BlockPos, BlockState> wall = Map.of();
    private final PaletteWallPreview preview = new PaletteWallPreview(() -> wall);
    private PaletteEntryList entryList;
    private int left, top, panelWidth, panelHeight, pickerWidth, right, rightWidth, previewY, previewHeight, entriesY;
    private long seed = 42;
    private UUID pendingSave;
    private Component status = Component.empty();
    private Button save;
    private Button delete;

    public PaletteEditorScreen(Screen parent, Optional<PlayerPalette> palette) {
        super(Component.translatable("chisel.palette.builder"));
        this.parent = parent;
        draft = new PaletteDraft(palette);
        picker = new PaletteBlockPicker(draft, this::addBlock, this::addRenderableWidget, this::removeWidget, () -> pendingSave != null);
        updatePreview();
    }

    private void addBlock(Block block) {
        if (draft.add(BuiltInRegistries.BLOCK.getKey(block), BuiltInRegistries.ITEM.getKey(block.asItem()))) {
            changed();
            picker.rebuild();
            entryList.rebuild();
            entryList.scrollToEnd();
        }
    }

    @Override
    protected void init() {
        double entryScroll = entryList == null ? 0 : entryList.scrollAmount();
        panelWidth = Math.min(620, width - 16);
        panelHeight = Math.min(350, height - 16);
        left = (width - panelWidth) / 2;
        top = (height - panelHeight) / 2;
        pickerWidth = Math.min(160, (panelWidth - 24) / 3);
        right = left + pickerWidth + 16;
        rightWidth = panelWidth - pickerWidth - 24;
        previewY = top + 72;
        previewHeight = Math.clamp(panelHeight / 4, 46, 86);
        entriesY = previewY + previewHeight + 6;
        preview.setX(right);
        preview.setY(previewY);
        preview.setWidth(rightWidth);
        preview.setHeight(previewHeight);
        preview.active = pendingSave == null;
        addRenderableWidget(preview);

        var name = addRenderableWidget(new EditBox(font, left + 8, top + 25, panelWidth - 16, 18, Component.translatable("chisel.palette.title")));
        name.setMaxLength(PaletteDefinition.MAX_NAME_LENGTH);
        name.setHint(Component.translatable("chisel.palette.title"));
        name.setValue(draft.value().name());
        name.setResponder(value -> {
            draft.name(value);
            changed();
        });

        addRenderableWidget(Button.builder(Component.translatable("chisel.palette.shuffle"), _ -> {
            seed++;
            updatePreview();
        }).bounds(right + rightWidth - 60, top + 50, 60, 18).build(PaletteButton::new));
        save = addRenderableWidget(Button.builder(Component.translatable("chisel.palette.save"), _ -> save()).bounds(left + panelWidth - 88, top + panelHeight - 24, 80, 20).build(PaletteButton::new));
        addRenderableWidget(Button.builder(Component.translatable("gui.cancel"), _ -> onClose()).bounds(left + 8, top + panelHeight - 24, 70, 20).build(PaletteButton::new));
        delete = null;
        if (draft.id().isPresent()) {
            delete = addRenderableWidget(Button.builder(Component.translatable("chisel.palette.delete"), _ -> confirmDelete())
                    .bounds(left + 84, top + panelHeight - 24, Math.clamp(panelWidth - 180, 40, 100), 20)
                    .tooltip(Tooltip.create(Component.translatable("chisel.palette.delete_hint"))).build(PaletteButton::new));
            delete.active = pendingSave == null && minecraft.player != null && PlayerPaletteManager.get(minecraft.player).find(draft.id().get()).isPresent();
        }
        picker.init(font, left + 8, top + 50, pickerWidth, top + panelHeight - 56);
        entryList = addRenderableWidget(new PaletteEntryList(font, draft, right, entriesY, rightWidth, top + panelHeight - 50 - entriesY, this::changed, picker::rebuild));
        entryList.setScrollAmount(entryScroll);
        updateSaveButton();
        if (pendingSave != null) children().forEach(child -> {
            if (child instanceof AbstractWidget widget) widget.active = false;
        });
    }

    private void changed() {
        status = Component.empty();
        if (entryList != null) entryList.refreshWeights();
        updatePreview();
        updateSaveButton();
    }

    private void updateSaveButton() {
        if (save != null)
            save.active = pendingSave == null && PaletteDefinition.validate(draft.value()).result().isPresent();
    }

    private void updatePreview() {
        var sample = PaletteWall.sample(draft.value(), seed, id -> BuiltInRegistries.BLOCK.getOptional(id)
                .filter(block -> !block.defaultBlockState().isAir() && block.asItem() != Items.AIR).isPresent());
        var blocks = new LinkedHashMap<BlockPos, BlockState>();
        for (int i = 0; i < sample.size(); i++) {
            blocks.put(new BlockPos(i % PaletteWall.COLUMNS, i / PaletteWall.COLUMNS, 0),
                    BuiltInRegistries.BLOCK.getOptional(sample.get(i)).orElseThrow().defaultBlockState());
        }
        wall = Map.copyOf(blocks);
    }

    private void save() {
        if (pendingSave != null || minecraft.player == null || minecraft.getConnection() == null) return;
        var validation = PaletteDefinition.validate(draft.value());
        if (validation.error().isPresent()) {
            status = Component.literal(validation.error().get().message());
            return;
        }
        var packet = new SavePalettePacket(draft.id(), draft.value());
        pendingSave = packet.requestId();
        status = Component.translatable("chisel.palette.saving");
        rebuildWidgets();
        minecraft.getConnection().send(packet);
    }

    private void confirmDelete() {
        if (pendingSave != null || draft.id().isEmpty() || minecraft.player == null || minecraft.getConnection() == null) return;
        var id = draft.id().get();
        var saved = PlayerPaletteManager.get(minecraft.player).find(id);
        if (saved.isEmpty()) return;
        minecraft.gui.setScreen(new ConfirmScreen(confirmed -> {
            if (!confirmed) {
                minecraft.gui.setScreen(this);
                return;
            }
            if (minecraft.player != null && minecraft.getConnection() != null && PlayerPaletteManager.get(minecraft.player).find(id).isPresent())
                minecraft.getConnection().send(new DeletePalettePacket(id));
            minecraft.gui.setScreen(parent);
        }, Component.translatable("chisel.palette.delete_title"), Component.translatable("chisel.palette.delete_body", saved.get().definition().name()), Component.translatable("chisel.palette.delete"), Component.translatable("gui.cancel")));
    }

    public void acceptSaveResult(PaletteSaveResultPacket packet) {
        if (!packet.requestId().equals(pendingSave)) return;
        pendingSave = null;
        if (packet.paletteId().isPresent()) {
            draft.saved(packet.paletteId().get());
            status = Component.translatable("chisel.palette.saved");
        } else status = Component.literal(packet.error());
        rebuildWidgets();
    }

    @Override
    public void onClose() {
        if (pendingSave != null) return;
        if (draft.dirty())
            minecraft.gui.setScreen(new ConfirmScreen(discard -> minecraft.gui.setScreen(discard ? parent : this), Component.translatable("chisel.palette.discard_title"), Component.translatable("chisel.palette.discard_body"), Component.translatable("chisel.palette.discard"), Component.translatable("chisel.palette.keep_editing")));
        else minecraft.gui.setScreen(parent);
    }

    @Override
    public void tick() {
        if (minecraft.player == null) minecraft.gui.setScreen(null);
        else {
            picker.tick();
            if (delete != null) delete.active = pendingSave == null && minecraft.getConnection() != null && draft.id().filter(id -> PlayerPaletteManager.get(minecraft.player).find(id).isPresent()).isPresent();
        }
    }

    @Override
    public void extractRenderState(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        PaletteTheme.panel(graphics, left, top, panelWidth, panelHeight);
        graphics.fill(right - 5, top + 48, right - 4, top + panelHeight - 50, PaletteTheme.GOLD);
        graphics.nextStratum();
        super.extractRenderState(graphics, mouseX, mouseY, partialTick);
        graphics.text(font, title, left + 8, top + 8, PaletteTheme.INK, false);
        var paletteIcon = BuiltInRegistries.ITEM.getOptional(draft.value().icon()).orElse(Items.BARRIER);
        graphics.item(new ItemStack(paletteIcon), left + panelWidth - 24, top + 4);
        graphics.text(font, Component.translatable("chisel.palette.preview"), right, top + 55, PaletteTheme.INK, false);
        picker.extractRenderState(graphics, font, mouseX, mouseY);
        var count = Component.translatable("chisel.palette.entries", draft.value().entries().size(), PaletteDefinition.MAX_ENTRIES);
        graphics.text(font, count, right + 4, top + panelHeight - 46, PaletteTheme.MUTED, false);
        graphics.text(font, font.plainSubstrByWidth(status.getString(), panelWidth - 16), left + 8, top + panelHeight - 35, PaletteTheme.INK, false);
        if (!status.getString().isEmpty() && mouseX >= left + 8 && mouseX < left + panelWidth - 8 && mouseY >= top + panelHeight - 35 && mouseY < top + panelHeight - 25)
            graphics.setTooltipForNextFrame(font, font.split(status, Math.min(300, width - 24)), mouseX, mouseY);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
