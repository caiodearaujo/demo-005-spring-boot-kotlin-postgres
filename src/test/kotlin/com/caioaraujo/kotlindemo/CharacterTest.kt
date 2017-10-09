package com.caioaraujo.kotlindemo

import com.caioaraujo.kotlindemo.entities.Character
import com.caioaraujo.kotlindemo.services.CharacterService
import org.junit.Assert
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
        char = this.service.save(char)
        Assert.assertFalse(char.id == 0)
    }

    @Test
    fun testListAll(){
        getListCharacters().iterator().forEach { character -> this.service.save(character) }
        Assert.assertTrue(this.service.listAll().size > 0)
    }

    fun getListCharacters(): Array<Character> {
        var char1 = Character("John Snow", "Know Nothing")
        var char2 = Character("Daenerys Targaryen", "Dracarius")
        var char3 = Character("Aria Stark", "Vallar Morghulis")
        val characterList = arrayOf(char1, char2, char3)
        return characterList
    }



}