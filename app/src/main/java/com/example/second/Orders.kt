package com.example.second

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_orders)

        val name = findViewById<TextView>(R.id.textView)
        val location  = findViewById<TextView>(R.id.textView2)
        val food = findViewById<TextView>(R.id.textView3)

        val intent = intent

        val names = intent.getStringExtra("name")
        val locations = intent.getStringExtra("location")
        val foods = intent.getStringExtra("food")

        name.text = "Name : $names"
        location.text = "Location : $locations"
        food.text = "Food : $foods"
    }
}