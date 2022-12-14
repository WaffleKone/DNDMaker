package com.DNDMaker;

import com.DNDMaker.character.Character;
import com.DNDMaker.character.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final CharacterRepository characterRepository;

    @Autowired
    public HelloController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @PostMapping("/createExampleCharacter")
    public void createExampleCharacter() {
        characterRepository.save(new Character(1L));
    }

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
    @GetMapping("/findAll")
    public List<Character> findAllCharacters() {
        return characterRepository.findAll();
    }
}
