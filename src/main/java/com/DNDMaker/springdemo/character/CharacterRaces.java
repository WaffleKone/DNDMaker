package com.DNDMaker.springdemo.character;

public enum CharacterRaces {
    dragonborn("Dragonborn"),
    dwarf("Dwarf"),
    elf("Elf"),
    gnome("Gnome"),
    halfling("Halfling"),
    halfElf("Half Elf"),
    halfOrc("Half Orc"),
    human("Human"),
    tiefling("Tiefling");

    public final String label;

    private CharacterRaces(String label) {
        this.label = label;
    }
}
