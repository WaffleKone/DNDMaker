package com.DNDMaker.character;

import com.DNDMaker.user.User;
import com.DNDMaker.user.UserPublicInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {this.characterRepository = characterRepository;}

    public Character createCharacter(Character character) {
        try {
            return characterRepository.save(character);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Character> listAllCharacters() {
        List<Character> characters = characterRepository.findAll();
        return characters;
    }

    public Character updateCharacter(Character character) {
        try {
            return characterRepository.save(character);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Character deleteCharacter(Character character) {
        try {
            characterRepository.delete(character);
            return character;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
