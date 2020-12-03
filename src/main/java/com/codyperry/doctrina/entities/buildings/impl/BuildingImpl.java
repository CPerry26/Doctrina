package com.codyperry.doctrina.entities.buildings.impl;

import com.codyperry.doctrina.entities.buildings.Building;
import com.codyperry.doctrina.entities.buildings.BuildingType;

/**
 * A base building type which has some default functionality.
 * All building types inherit from this class either directly
 * or through the hierarchy.
 */
public class BuildingImpl implements Building
{
    private String buildingName;
    private int totalHealth;
    private int currentHealth;
    private BuildingType buildingType;

    /**
     * Create a building. This constructor will be called by the
     * children.
     *
     * @param name : The name of the building (random or assigned by the player).
     * @param totalHealth : The building's total health.
     * @param type : The type of the building.
     */
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
