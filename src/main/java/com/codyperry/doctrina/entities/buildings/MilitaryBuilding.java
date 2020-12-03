package com.codyperry.doctrina.entities.buildings;

import com.codyperry.doctrina.entities.units.UnitType;

public interface MilitaryBuilding extends Building
{

    /**
     * Get the attack value this building can use in defense of itself.
     */
    int getDefenseAttack();

    /**
     * Get the attack value this building can use to attack enemy units.
     * The difference between this and defense is that the defense attack
     * is only triggered when the building is attacked/targeted. This can be
     * used on any enemy unit within range.
     */
    int getAttack();

    /**
     * Produce the given unit type. Validation for this action
     * is done within this method.
     *
     * @param unitType : The type of unit the player wants to create.
     */
    void produceUnit(UnitType unitType);
}
