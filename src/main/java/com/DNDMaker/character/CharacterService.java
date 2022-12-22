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

    public Boolean authorizeCharacterUse(CharacterUserDto characterUserDto) {
        if(characterRepository.existsById(characterUserDto.getCharacterId()) && Objects.equals(characterUserDto.getUserId(), characterUserDto.getPlayerId())) {
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
            if(authorizeCharacterUse(characterUserDto)) {
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

    public CharacterUserDto deleteCharacter(CharacterUserDto characterUserDto) {
        try {
            if(authorizeCharacterUse(characterUserDto)) {
                characterRepository.delete(characterRepository.findById(characterUserDto.getCharacterId()).get());
            }
            return characterUserDto;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
