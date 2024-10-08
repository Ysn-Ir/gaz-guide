package com.example.thegazdetectormanual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class manual : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)
var tvManualContent:TextView=findViewById(R.id.tvManualContent)
        var btnEnglish: Button = findViewById(R.id.btnEnglish)
        var btnArabic: Button = findViewById(R.id.btnArabic)
        var btnFrench: Button = findViewById(R.id.btnFrench)

        // Set English content by default
        tvManualContent.text = getString(R.string.manual_content_english)

        // Language button listeners
        btnEnglish.setOnClickListener {
            tvManualContent.text = getString(R.string.manual_content_english)
        }

        btnArabic.setOnClickListener {
            tvManualContent.text = getString(R.string.manual_content_arabic)
        }

        btnFrench.setOnClickListener {
            tvManualContent.text = getString(R.string.manual_content_french)
        }
    }
}
