package com.example.second

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Explicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit)

        val intentbtn = findViewById<Button>(R.id.button)

        intentbtn.setOnClickListener(){
            intent = Intent(applicationContext, View::class.java)
            startActivity(intent)
        }
    }
}