package com.hfad.homework1

import kotlin.text.StringBuilder

class Admin(id: Int, name: String, private val consumers : List<Consumer.InformationConsumer>) : User(id, name) {
    override fun toString(): String {
        var substr = "Admin $id name: $name\n"
        for(consum in consumers){
            substr += consum.toString() + "\n"
        }
        return substr
    }
}