package com.caioaraujo.kotlindemo.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    lateinit var name: String
    lateinit var skill: String
    override fun toString(): String {
        return "Character(id=$id, name='$name', skill='$skill')"
    }


}