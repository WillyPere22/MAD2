// DisplayActivity.kt
package com.example.agecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewAge = findViewById<TextView>(R.id.textViewAge)

        // Retrieve data from the Intent
        val name = intent.getStringExtra("name")
        val yearOfBirth = intent.getIntExtra("yearOfBirth", 0)

        // Calculate age
        val currentYear = 2024
        val age = currentYear - yearOfBirth

        // Display name and age
        textViewName.text = "Name: $name"
        textViewAge.text = "Age: $age years"
    }
}
