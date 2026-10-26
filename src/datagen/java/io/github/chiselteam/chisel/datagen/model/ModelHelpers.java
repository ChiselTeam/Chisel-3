package io.github.chiselteam.chisel.datagen.model;

import net.minecraft.data.models.blockstates.Condition;
import net.minecraft.world.level.block.state.properties.Property;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.condition;

public class ModelHelpers {

    public static Condition centerCondition(Property<Boolean> direction, Property<Boolean> opposite, Property<Boolean> perpendicularA, Property<Boolean> perpendicularB) {
        return Condition.and(
                condition().term(direction, false),
                Condition.or(
                        condition().term(opposite, false),
                        condition().term(perpendicularA, true),
                        condition().term(perpendicularB, true)
                )
        );
    }

    public static Condition endCondition(Property<Boolean> direction, Property<Boolean> opposite, Property<Boolean> perpendicularA, Property<Boolean> perpendicularB) {
        return condition()
                .term(direction, false)
                .term(opposite, true)
                .term(perpendicularA, false)
                .term(perpendicularB, false)
                ;
    }
}
