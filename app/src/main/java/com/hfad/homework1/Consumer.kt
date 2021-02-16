package com.hfad.homework1

class Consumer(id: Int, name: String, val age : Int) : User(id, name) {
    var informationConsumer : InformationConsumer
     init {
        informationConsumer = InformationConsumer(id,"$name, $age")
    }
    inner class InformationConsumer(val idConsumer: Int, val note: String){
        override fun toString(): String {
            return "InformationConsumer(idConsumer=$idConsumer, note='$note')"
        }
    }

}