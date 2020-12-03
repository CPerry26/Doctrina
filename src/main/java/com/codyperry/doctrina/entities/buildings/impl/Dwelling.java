package com.codyperry.doctrina.entities.buildings.impl;

import com.codyperry.doctrina.entities.buildings.BuildingType;

/**
 * A building which is needed in order to produce labor units.
 * These buildings can be attacked but cannot attack back.
 * Laborers will defend their dwelling however.
 */
public class Dwelling extends BuildingImpl
{
    // The maximum amount of health this building has.
    private static final int MAX_HEALTH = 1500;

    /**
     * Public constructor for creating a new dwelling.
     *
     * @param name : The name of the dwelling. This will
     *             either be random or assigned by the player.
     */
    public Dwelling(String name)
    {
        super(name, MAX_HEALTH, BuildingType.DWELLING);
    }
}
