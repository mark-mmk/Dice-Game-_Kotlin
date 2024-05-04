package com.example.simpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var lucky: EditText
    lateinit var bt1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        lucky = findViewById(R.id.lucky)
        bt1 = findViewById(R.id.bt1)
        bt1.setOnClickListener {
            var luckyint = lucky.text.toString()
            if (name.text.isEmpty()) {
                Toast.makeText(this, "Enter Name", Toast.LENGTH_LONG).show()
            } else if (luckyint.isEmpty()) {
                Toast.makeText(this, "Enter Lucky Number", Toast.LENGTH_LONG).show()
            } else if (luckyint.toInt() > 0 && luckyint.toInt() > 6) {
                Toast.makeText(this, "Enter Lucky Number From 1 to 6", Toast.LENGTH_LONG).show()
            } else {
                var i = Intent(this, home::class.java)
                i.putExtra("name", name.text.toString())
                i.putExtra("lucky", lucky.text.toString())
                startActivity(i)
            }

        }
    }

}