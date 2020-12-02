package com.codyperry.doctrina.entities.impl;

import com.codyperry.doctrina.entities.Unit;
import com.codyperry.doctrina.entities.UnitType;

public class UnitImpl implements Unit
{
    private String unitName;
    private int totalHealth;
    private int currentHealth;
    private int attack;
    private UnitType unitType;

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
