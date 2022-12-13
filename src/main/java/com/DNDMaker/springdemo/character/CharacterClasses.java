package com.DNDMaker.springdemo.character;

public enum CharacterClasses {
    barbarian("Barbarian"),
    bard("Bard"),
    cleric("Cleric"),
    druid("Druid"),
    fighter("Fighter"),
    monk("Monk"),
    paladin("Paladin"),
    ranger("Ranger"),
    rogue("Rogue"),
    sorcerer("Sorcerer"),
    warlock("Warlock"),
    wizard("Wizard");

    public final String label;

    CharacterClasses(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}