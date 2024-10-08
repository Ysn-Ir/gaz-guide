package com.example.thegazdetectormanual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class odd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odd)
        var tvManualContent:TextView=findViewById(R.id.odd)
        var btnEnglish: Button = findViewById(R.id.btnEnglish0)
        var btnArabic: Button = findViewById(R.id.btnArabic0)
        var btnFrench: Button = findViewById(R.id.btnFrench0)

        // Set English content by default
        tvManualContent.text = getString(R.string.odd_french)

        // Language button listeners
        btnEnglish.setOnClickListener {
            tvManualContent.text = getString(R.string.odd_english)
        }

        btnArabic.setOnClickListener {
            tvManualContent.text = getString(R.string.odd_arabic)
        }

        btnFrench.setOnClickListener {
            tvManualContent.text = getString(R.string.odd_french)
        }
    }
}
