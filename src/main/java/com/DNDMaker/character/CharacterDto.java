package com.DNDMaker.character;

public class CharacterDto {

    private Long characterId;

    private Long playerId;

    private String characterName;

    private CharacterAlignments characterAlignments;

    private CharacterClasses characterClasses;

    private int characterLevel;

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public CharacterAlignments getCharacterAlignments() {
        return characterAlignments;
    }

    public void setCharacterAlignments(CharacterAlignments characterAlignments) {
        this.characterAlignments = characterAlignments;
    }

    public CharacterClasses getCharacterClasses() {
        return characterClasses;
    }

    public void setCharacterClasses(CharacterClasses characterClasses) {
        this.characterClasses = characterClasses;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }
}
