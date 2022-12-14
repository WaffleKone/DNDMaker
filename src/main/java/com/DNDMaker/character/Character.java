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

    private CharacterAlignments characterAlignments;

    private CharacterClasses characterClasses;

    private CharacterRaces characterRaces;

    public Character() {

    }

    public Character(Long playerId) {
        this.playerId = playerId;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    @Override
    public String toString() {
        return "Character{" +
                "characterId=" + characterId +
                ", playerId=" + playerId +
                '}';
    }
}