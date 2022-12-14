package com.DNDMaker;

import com.DNDMaker.character.Character;
import com.DNDMaker.character.CharacterRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CharacterPersistenceTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(CharacterPersistenceTests.class);

    @Autowired
    private CharacterRepository characterRepository;

    @AfterEach
    public void report() {
        LOGGER.info("Tests complete.");
        LOGGER.info("Repository Count: {}", characterRepository.count());
    }

    @Test
    public void saveTest() {
        Character character = new Character();
        characterRepository.save(character);
    }
}