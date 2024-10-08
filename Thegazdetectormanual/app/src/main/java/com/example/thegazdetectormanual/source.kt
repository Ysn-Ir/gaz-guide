package com.example.thegazdetectormanual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class source : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_source)
        var tvManualContent:TextView=findViewById(R.id.source)


        // Set English content by default
        tvManualContent.text = getString(R.string.source_code)


    }
}
