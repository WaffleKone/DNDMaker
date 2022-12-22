package com.DNDMaker.character;

public class CharacterUserDto {
    private Long characterId;

    private Long playerId;

    private Long userId;

    private String characterName;

    private CharacterAlignments characterAlignments;

    private CharacterClasses characterClasses;

    private int characterLevel;
    private int maxHp;
    private int currentHp;
    private int armor;
    private int attackBonus;
    private int speed;

    public CharacterUserDto(Long characterId, Long playerId, Long userId, String characterName,
                            CharacterAlignments characterAlignments, CharacterClasses characterClasses,
                            int characterLevel, int maxHp, int currentHp, int armor, int attackBonus, int speed) {
        this.characterId = characterId;
        this.playerId = playerId;
        this.userId = userId;
        this.characterName = characterName;
        this.characterAlignments = characterAlignments;
        this.characterClasses = characterClasses;
        this.characterLevel = characterLevel;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.armor = armor;
        this.attackBonus = attackBonus;
        this.speed = speed;
    }

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
