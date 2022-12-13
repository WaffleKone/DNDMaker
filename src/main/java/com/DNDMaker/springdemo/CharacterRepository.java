package com.DNDMaker.springdemo;

import com.DNDMaker.springdemo.character.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long > {
}
