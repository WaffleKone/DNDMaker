package com.DNDMaker.character;

public enum CharacterRaces {
    elf("Elf"),
    human("Human"),
    dwarf("Dwarf");

    public final String label;

    CharacterRaces(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
