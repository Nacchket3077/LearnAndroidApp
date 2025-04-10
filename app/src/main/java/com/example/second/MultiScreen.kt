package com.example.second

import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MultiScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multi_screen)

        val name = findViewById<EditText>(R.id.Name)
        val location = findViewById<EditText>(R.id.Location)
        val food = findViewById<EditText>(R.id.Food)
        val btnOrder = findViewById<Button>(R.id.butorder)

        btnOrder.setOnClickListener(){

            val Name = name.text.toString()
            val Location = location.text.toString()
            val food = food.text.toString()

            val intent = Intent(this, Orders::class.java)
            intent.putExtra("name",Name)
            intent.putExtra("location",Location)
            intent.putExtra("food",food)
            startActivity(intent)

        }


    }
}