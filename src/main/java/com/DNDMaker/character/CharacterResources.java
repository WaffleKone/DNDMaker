package com.DNDMaker.character;

import java.util.Map;

public class CharacterResources {
    private int maxHp;
    private int currentHp;
    private int armor;
    private int attackBonus;

    private int speed;

    public CharacterResources() {
    }

    public CharacterResources(int maxHp, int currentHp, int armor, int attackBonus) {
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.armor = armor;
        this.attackBonus = attackBonus;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }
}
