package com.codyperry.doctrina.entities.units;

/**
 * All unit types implement this interface. All the specific
 * super unit types will extend this interface.
 */
public interface Unit
{

    String getUnitName();

    int getTotalHealth();

    int getCurrentHealth();

    int getAttack();

    UnitType getUnitType();
}
