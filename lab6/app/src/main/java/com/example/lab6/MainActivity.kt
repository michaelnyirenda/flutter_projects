package com.example.lab6

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mystring: String = resources.getString(R.string.affirmation3)
        val textView: TextView = findViewById(R.id.textview)
        textView.text = mystring
    }
}
