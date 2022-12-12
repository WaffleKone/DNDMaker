package com.example.springdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String characterName;
    private String playerName;
    private Integer characterLevel;
    private String characterClass;
    private String background;
    private String race;
    private String alignment;
    private Integer experiencePoints;
    private Integer strengthScore;
    private Integer dexterityScore;
    private Integer constitutionScore;
    private Integer intelligenceScore;
    private Integer wisdomScore;
    private Integer charismaScore;
    private Integer armorClass;
    private Integer speed;
    private Integer maxHitPoints;
    private Integer currentHitPoints;
    private Integer tempHitPoints;
    private Integer totalHitDice;
    private Integer currentHitDice;
    private Integer copperCoins;
    private Integer silverCoins;
    private Integer goldCoins;
    private Integer platinumCoins;
    private String languages;
    protected Character() {}

    public Character(Long id, String characterName, String playerName, Integer characterLevel, String characterClass, String background, String race, String alignment, Integer experiencePoints, Integer strengthScore, Integer dexterityScore, Integer constitutionScore, Integer intelligenceScore, Integer wisdomScore, Integer charismaScore, Integer armorClass, Integer speed, Integer maxHitPoints, Integer currentHitPoints, Integer tempHitPoints, Integer totalHitDice, Integer currentHitDice, Integer copperCoins, Integer silverCoins, Integer goldCoins, Integer platinumCoins, String languages) {
        this.id = id;
        this.characterName = characterName;
        this.playerName = playerName;
        this.characterLevel = characterLevel;
        this.characterClass = characterClass;
        this.background = background;
        this.race = race;
        this.alignment = alignment;
        this.experiencePoints = experiencePoints;
        this.strengthScore = strengthScore;
        this.dexterityScore = dexterityScore;
        this.constitutionScore = constitutionScore;
        this.intelligenceScore = intelligenceScore;
        this.wisdomScore = wisdomScore;
        this.charismaScore = charismaScore;
        this.armorClass = armorClass;
        this.speed = speed;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.tempHitPoints = tempHitPoints;
        this.totalHitDice = totalHitDice;
        this.currentHitDice = currentHitDice;
        this.copperCoins = copperCoins;
        this.silverCoins = silverCoins;
        this.goldCoins = goldCoins;
        this.platinumCoins = platinumCoins;
        this.languages = languages;
    }
    public Long getId() {
        return id;
    }

    public String getCharacterName(){
        return characterName;
    }

    public String getPlayerName(){
        return playerName;
    }
}