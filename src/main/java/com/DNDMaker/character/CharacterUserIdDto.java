package com.DNDMaker.character;

public class CharacterUserIdDto {
    private Long characterId;
    private Long userId;
    private Long playerId;

    public CharacterUserIdDto(Long characterId, Long userId, Long playerId) {
        this.characterId = characterId;
        this.userId = userId;
        this.playerId = playerId;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}
