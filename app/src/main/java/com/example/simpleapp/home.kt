package com.example.simpleapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class home : AppCompatActivity() {
    lateinit var name2: TextView
    lateinit var lucky2: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        name2 = findViewById(R.id.name2)
        lucky2 = findViewById(R.id.lucky2)
        var i = intent
        val name = i.getStringExtra("name")
        val lucky = i.getStringExtra("lucky")
        name2.text = "Name : ${name.toString()}"
        lucky2.text = "You Lucky Number is : ${lucky.toString()}"
        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("lucky", lucky)
        val f1 = frame1()
        f1.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.frame, f1).commit()
    }
}