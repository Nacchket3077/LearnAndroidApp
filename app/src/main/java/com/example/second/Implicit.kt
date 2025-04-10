package com.example.second

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.net.Uri
import android.provider.MediaStore
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Implicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)

        val webbutton = findViewById<CardView>(R.id.webcard)
        val camerabutton = findViewById<CardView>(R.id.cameracard)

        webbutton.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://nacchket3077.github.io/GNPPRACTICE/")
            startActivity(intent)
        }

        camerabutton.setOnClickListener(){
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }
     }
}