package com.DNDMaker.character;

public enum CharacterClasses {
    fighter("Fighter"),
    rogue("Rogue"),
    wizard("Wizard"),
    priest("Priest");
    public final String label;

    CharacterClasses(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}