package com.example.second

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.intellij.lang.annotations.Language
import java.util.Locale

class MultiLanguage : AppCompatActivity() {

    companion object{
        var selectedLanguage : String = "en"
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(appLanguage(newBase)!!)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multi_language)

        val englisbtn = findViewById<Button>(R.id.EnglishButton)
        val hindibtn = findViewById<Button>(R.id.hindiButton)
        val spanbtn = findViewById<Button>(R.id.SpanishButton)

        englisbtn.setOnClickListener(){changeLanguage("en")}
        hindibtn.setOnClickListener(){changeLanguage("hi")}
        spanbtn.setOnClickListener(){changeLanguage("es")}
    }

    private fun changeLanguage (language: String){
        selectedLanguage = language
        val intent = Intent(this, MultiLanguage::class.java)
        startActivity(intent)
        finish()
    }

    private  fun appLanguage(context: Context): Context? {
        val locale = Locale(selectedLanguage)
        Locale.setDefault(locale)

        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)

        return context.createConfigurationContext(config)
    }
}