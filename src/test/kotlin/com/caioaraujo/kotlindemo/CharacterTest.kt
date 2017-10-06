package com.caioaraujo.kotlindemo

import com.caioaraujo.kotlindemo.entities.Character
import com.caioaraujo.kotlindemo.services.CharacterService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class CharacterTest {

    @Autowired
    lateinit var service: CharacterService

    @Test
    fun testSave() {
        var char = Character()
        char.name = "Jhon Snow"
        char.skill = "Know Nothing"
        this.service.save(char)


    }

}