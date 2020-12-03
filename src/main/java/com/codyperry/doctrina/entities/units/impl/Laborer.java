package com.codyperry.doctrina.entities.units.impl;

import com.codyperry.doctrina.entities.units.UnitType;

/**
 * Generic laborer class. These units can produce buildings and
 * perform activities (i.e. hunting). There is a specialized version
 * of a laborer which provides bonuses to a particular activity.
 */
public class Laborer extends UnitImpl
{
    // Maximum health, will be tuned over time.
    private static final int MAX_HEALTH = 2000;

    // Basic attack value. This may vary depending on specialization
    // (i.e. a hunter which is skilled in weapons may be more than the
    // unspecialized version).
    private static final int ATTACK = 150;

    /**
     * Public constructor.
     *
     * @param name : The name of the laborer which is either random
     *             or assigned by the player.
     */
    public Laborer(String name)
    {
        super(name, MAX_HEALTH, ATTACK, UnitType.LABORER);
    }
}
