package com.DNDMaker.character;

import com.DNDMaker.exceptions.InvalidCharacterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {this.characterRepository = characterRepository;}

    public Boolean authorizeCharacterUse(CharacterUserIdDto characterUserIdDto) {
        if(characterRepository.existsById(characterUserIdDto.getCharacterId()) && Objects.equals(characterUserIdDto.getUserId(), characterUserIdDto.getPlayerId())) {
            return true;
        } else {
            throw new InvalidCharacterException();
        }
    }

    public Character createCharacter(Character character) {
        try {
            return characterRepository.save(character);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Character> listAllCharacters() {
        return characterRepository.findAll();
    }

    public CharacterUserDto updateCharacter(CharacterUserDto characterUserDto) {
        try {
            if(authorizeCharacterUse(new CharacterUserIdDto(characterUserDto.getCharacterId(), characterUserDto.getUserId(), characterUserDto.getPlayerId()))) {
                Character character = new Character(characterUserDto.getPlayerId(), characterUserDto.getCharacterId(),
                        characterUserDto.getCharacterName(), characterUserDto.getCharacterAlignments(),
                        characterUserDto.getCharacterClasses(), characterUserDto.getCharacterLevel(),
                        characterUserDto.getMaxHp(), characterUserDto.getCurrentHp(), characterUserDto.getArmor(),
                        characterUserDto.getAttackBonus(), characterUserDto.getSpeed());
                characterRepository.save(character);
            }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return characterUserDto;
    }

    public CharacterUserIdDto deleteCharacter(CharacterUserIdDto characterUserIdDto) {
        try {
            if(authorizeCharacterUse(characterUserIdDto)) {
                characterRepository.delete(characterRepository.findById(characterUserIdDto.getCharacterId()).get());
            }
            return characterUserIdDto;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
