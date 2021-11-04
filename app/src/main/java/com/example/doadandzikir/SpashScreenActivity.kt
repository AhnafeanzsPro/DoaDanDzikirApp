package com.example.doadandzikir

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SpashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}