package com.hfad.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val consumer1 = Consumer(1, "Misha", 25)
        val consumer2 = Consumer(2, "Jon", 41)
        val consumer3 = Consumer(3, "Andrey", 29)
        val consumer4 = Consumer(4, "Selena", 15)
        val consumer5 = Consumer(5, "Jes", 22)
        val admin1 = Admin(1,"Artiom", listOf(consumer1.informationConsumer,consumer2.informationConsumer,consumer3.informationConsumer))
        val admin2 = Admin(2,"Dmitriy", listOf(consumer5.informationConsumer,consumer4.informationConsumer,consumer3.informationConsumer))
        val admin3 = Admin(3,"Kile", listOf(consumer4.informationConsumer,consumer1.informationConsumer,consumer2.informationConsumer))
        val text: TextView = findViewById(R.id.test)
        text.setText(admin1.toString())
    }
}