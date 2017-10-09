package com.caioaraujo.kotlindemo.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Character constructor() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    lateinit var name: String
    lateinit var skill: String

    constructor(id: Int, name: String, skill: String) : this() {
        this.id = id
        this.name = name
        this.skill = skill
    }

    constructor(name: String, skill: String) : this() {
        this.name = name
        this.skill = skill
    }

    override fun toString(): String {
        return "Character(id=$id, name='$name', skill='$skill')"
    }


}