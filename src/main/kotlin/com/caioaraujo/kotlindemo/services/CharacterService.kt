package com.caioaraujo.kotlindemo.services

import com.caioaraujo.kotlindemo.entities.Character
import com.caioaraujo.kotlindemo.repositories.CharacterRepository
import org.springframework.stereotype.Service

@Service
class CharacterService(val repository: CharacterRepository) {

    fun save(char: Character): Character {
        return this.repository.save(char)
    }

    fun listAll(): MutableList<Character> {
        return this.repository.findAll()
    }

}