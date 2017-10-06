package com.caioaraujo.kotlindemo.repositories

import com.caioaraujo.kotlindemo.entities.Character
import org.springframework.data.jpa.repository.JpaRepository

interface CharacterRepository : JpaRepository<Character, Int>