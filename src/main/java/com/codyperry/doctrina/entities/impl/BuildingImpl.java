package com.codyperry.doctrina.entities.impl;

import com.codyperry.doctrina.entities.Building;
import com.codyperry.doctrina.entities.BuildingType;

public class BuildingImpl implements Building
{
    private String buildingName;
    private int totalHealth;
    private int currentHealth;
    private BuildingType buildingType;

    public BuildingImpl(String name, int totalHealth, BuildingType type)
    {
        this.buildingName = name;
        this.totalHealth = totalHealth;
        this.currentHealth = totalHealth;
        this.buildingType = type;
    }

    public String getBuildingName()
    {
        return this.buildingName;
    }

    public int getTotalHealth()
    {
        return this.totalHealth;
    }

    public int getCurrentHealth()
    {
        return this.currentHealth;
    }

    public BuildingType getBuildingType()
    {
        return this.buildingType;
    }
}
