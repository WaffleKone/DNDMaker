package com.DNDMaker.character;

import jakarta.persistence.PostUpdate;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    // Update Character
    // Delete Character
    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // Create Empty Character
    @PostMapping(value="/createCharacter", consumes="application/json", produces="application/json")
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        characterService.createCharacter(character);
        return ResponseEntity.status(HttpStatus.CREATED).body(character);
    }

    @GetMapping(value="/characterList", produces="application/json")
    public ResponseEntity<List<Character>> listAllCharacters() {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.listAllCharacters());
    }
    // Update Existing Character
    @PutMapping(value="/updateCharacter", consumes="application/json", produces="application/json")
    public ResponseEntity<Character> updateCharacter(@RequestBody Character character) {
        characterService.updateCharacter(character);
        return ResponseEntity.status(HttpStatus.OK).body(character);
    }

    // Delete Existing Character
    @DeleteMapping(value="/deleteCharacter", consumes="application/json", produces="application/json")
    public ResponseEntity<Character> deleteCharacter(@RequestBody Character character) {
        characterService.deleteCharacter(character);
        return ResponseEntity.status(HttpStatus.OK).body(character);
    }
}
