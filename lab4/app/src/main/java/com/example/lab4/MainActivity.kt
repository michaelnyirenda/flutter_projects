package com.example.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start: Button = findViewById(R.id.button_start)
        val name:androidx.appcompat.widget.AppCompatEditText = findViewById(R.id.et_name)
        start.setOnClickListener {
            if (name.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else {
                val intent = Intent(this, QuizQuestions::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}