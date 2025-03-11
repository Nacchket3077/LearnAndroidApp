package com.example.second

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class InteractiveUI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interactive_ui)

        val btnDark = findViewById<Button>(R.id.btnDark)
        val btnRead = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        btnRead.setOnClickListener {
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
        }

        btnDark.setOnClickListener {
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
        }
    }
}
