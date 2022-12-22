package com.DNDMaker.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // Create Empty Character
    @PostMapping(value="/createCharacter", consumes="application/json", produces="application/json")
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        return ResponseEntity.status(HttpStatus.CREATED).body(characterService.createCharacter(character));
    }
    // Get All Characters
    @GetMapping(value="/characterList", produces="application/json")
    public ResponseEntity<List<Character>> listAllCharacters() {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.listAllCharacters());
    }
    // Update Existing Character
    @PutMapping(value="/updateCharacter", consumes="application/json", produces="application/json")
    public ResponseEntity<CharacterUserDto> updateCharacter(@RequestBody CharacterUserDto characterUserDto) {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.updateCharacter(characterUserDto));
    }

    // Delete Existing Character
    @DeleteMapping(value="/deleteCharacter", consumes="application/json", produces="application/json")
    public ResponseEntity<CharacterUserDto> deleteCharacter(@RequestBody CharacterUserDto characterUserDto) {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.deleteCharacter(characterUserDto));
    }
}
