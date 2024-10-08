package com.example.thegazdetectormanual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Delay for 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            // Start MainActivity
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
            finish() // Close SplashActivity
        }, 3000) // 3000 milliseconds = 3 seconds
    }
    }
