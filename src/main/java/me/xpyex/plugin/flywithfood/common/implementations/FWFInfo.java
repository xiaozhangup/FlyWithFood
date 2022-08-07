package me.xpyex.plugin.flywithfood.common.implementations;

import me.xpyex.plugin.flywithfood.common.implementations.flyenergy.EnergyManager;
import me.xpyex.plugin.flywithfood.common.implementations.flyenergy.FlyEnergy;

public class FWFInfo {
    private final Integer cost;
    private final Integer disable;
    private final FlyEnergy energy;

    public FWFInfo(Integer cost, Integer disable, String energy) {
        this.cost = cost;
        this.disable = disable;
        this.energy = EnergyManager.getEnergy(energy);
    }

    public Integer getCost() {
        return this.cost;
    }

    public Integer getDisable() {
        return this.disable;
    }

    public FlyEnergy getEnergy() {
        return this.energy;
    }
}
