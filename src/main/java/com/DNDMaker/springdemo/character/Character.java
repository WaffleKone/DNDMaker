package com.DNDMaker.springdemo.character;

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
    private CharacterDetails characterDetails;
    private CharacterRaces characterRaces;

}