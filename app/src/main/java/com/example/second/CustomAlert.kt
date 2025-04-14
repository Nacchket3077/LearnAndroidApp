package com.example.second

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_alert)

        val cdiloge = findViewById<Button>(R.id.custom_alert)

        cdiloge.setOnClickListener(){

            val dilogeview = layoutInflater.inflate(R.layout.custom_dialog, null)


            val builder = AlertDialog.Builder(this)
            builder.setView(dilogeview)
            builder.setTitle("Custom Input")

            builder.setPositiveButton("Yes"){_,_ ->
                val nameInput = dilogeview.findViewById<EditText>(R.id.editTextName).text.toString()
                Toast.makeText(this, "Youe Entered: $nameInput", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No"){diolg,_ ->
                diolg.dismiss()
            }

            val diloge = builder.create()
            diloge.show()

        }
    }
}