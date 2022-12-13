package com.DNDMaker.springdemo.character;

import java.util.Map;

public class CharacterResources {
    private Integer maxHitPoints;
    private Integer currentHitPoints;
    private Integer temporaryHitPoints;
    private Integer maxHitDice;
    private Integer currentHitDice;
    private Boolean inspiration;
    private Map<CurrencyTypes, Integer> currencies;

    public Integer getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(Integer maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public Integer getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public Integer getTemporaryHitPoints() {
        return temporaryHitPoints;
    }

    public void setTemporaryHitPoints(Integer temporaryHitPoints) {
        this.temporaryHitPoints = temporaryHitPoints;
    }

    public Integer getMaxHitDice() {
        return maxHitDice;
    }

    public void setMaxHitDice(Integer maxHitDice) {
        this.maxHitDice = maxHitDice;
    }

    public Integer getCurrentHitDice() {
        return currentHitDice;
    }

    public void setCurrentHitDice(Integer currentHitDice) {
        this.currentHitDice = currentHitDice;
    }

    public Boolean getInspiration() {
        return inspiration;
    }

    public void setInspiration(Boolean inspiration) {
        this.inspiration = inspiration;
    }

    public Map<CurrencyTypes, Integer> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<CurrencyTypes, Integer> currencies) {
        this.currencies = currencies;
    }
}
