package com.codyperry.doctrina.entities.units.impl;

import com.codyperry.doctrina.entities.units.Unit;
import com.codyperry.doctrina.entities.units.UnitType;

/**
 * Base level unit type. This defines basic functionality
 * that all unit types inherit from.
 */
public class UnitImpl implements Unit
{
    private String unitName;
    private int totalHealth;
    private int currentHealth;
    private int attack;
    private UnitType unitType;

    /**
     * Public constructor for a unit object.
     *
     * @param name : The name of the unit (random or assigned).
     * @param totalHealth : The total health of the unit.
     * @param attack : The total attack value this unit can do.
     * @param type : The type of unit.
     */
    public UnitImpl(String name, int totalHealth, int attack, UnitType type)
    {
        this.unitName = name;
        this.totalHealth = totalHealth;
        this.currentHealth = totalHealth;
        this.attack = attack;
        this.unitType = type;
    }

    public String getUnitName()
    {
        return this.unitName;
    }

    public int getTotalHealth()
    {
        return this.totalHealth;
    }

    public int getCurrentHealth()
    {
        return this.currentHealth;
    }

    public int getAttack()
    {
        return this.attack;
    }

    public UnitType getUnitType()
    {
        return this.unitType;
    }
}
