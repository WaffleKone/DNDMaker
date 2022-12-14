package com.DNDMaker.character;

import java.util.Map;

public class CharacterDetails {
    private String characterName;
    private String background;
    private Map<CharacterClasses, Integer> classes;

    public CharacterDetails(String characterName, String background) {
        this.characterName = characterName;
        this.background = background;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
