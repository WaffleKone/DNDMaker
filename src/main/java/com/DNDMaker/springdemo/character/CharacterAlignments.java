package com.DNDMaker.springdemo.character;

public enum CharacterAlignments {
    LG("Lawful Good"),
    NG("Neutral Good"),
    CG("Chaotic Good"),
    LN("Lawful Neutral"),
    N("True Neutral"),
    CN("Chaotic Neutral"),
    LE("Lawful Evil"),
    NE("Neutral Evil"),
    CE("Chaotic Evil");

    public final String label;

    private CharacterAlignments(String label) {
        this.label = label;
    }
}
