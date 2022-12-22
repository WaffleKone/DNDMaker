package com.DNDMaker.character;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
        public class Character {

            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            private Long characterId;

            private Long playerId;

            private String characterName;

            private CharacterAlignments characterAlignments;

            private CharacterClasses characterClasses;

            private int characterLevel;



            public Character() {

    }

    public Character(Long playerId) {
        this.playerId = playerId;
    }

    public Character(Long characterId, Long playerId, String characterName, CharacterAlignments characterAlignments, CharacterClasses characterClasses, int characterLevel) {
        this.characterId = characterId;
        this.playerId = playerId;
        this.characterName = characterName;
        this.characterAlignments = characterAlignments;
        this.characterClasses = characterClasses;
        this.characterLevel = characterLevel;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
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

    @Override
    public String toString() {
        return "Character{" +
                "characterId=" + characterId +
                ", playerId=" + playerId +
                '}';
    }
}