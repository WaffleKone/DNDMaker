package com.DNDMaker.character;

public enum CharacterAlignments {
    G ("Good"),
    B ("Bad"),
    N("Neutral");

    public final String label;

    CharacterAlignments(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
