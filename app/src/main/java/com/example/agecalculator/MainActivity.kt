// MainActivity.kt
package com.example.agecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextYear = findViewById<EditText>(R.id.editTextYear)
        val buttonSend = findViewById<Button>(R.id.buttonSend)

        buttonSend.setOnClickListener {
            val name = editTextName.text.toString()
            val yearOfBirth = editTextYear.text.toString().toIntOrNull()

            // Validate input before sending data
            if (name.isNotBlank() && yearOfBirth != null) {
                val intent = Intent(this, DisplayActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("yearOfBirth", yearOfBirth)
                startActivity(intent)
            }
        }
    }
}
