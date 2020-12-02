package com.codyperry.doctrina.entities;

/**
 * Base level building. All buildings implement this interface.
 * More specific super building types will also be interfaces and extend this one.
 */
public interface Building
{

    String getBuildingName();

    int getTotalHealth();

    int getCurrentHealth();

    BuildingType getBuildingType();
}
