package com.example.second

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnUpload: Button = findViewById(R.id.btnUpload)
        val btnDownload: Button = findViewById(R.id.btnDownload)

        btnUpload.setOnClickListener {

            Toast.makeText(this, "Uploading...", Toast.LENGTH_SHORT).show()
        }

        btnDownload.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
        }

    }
}