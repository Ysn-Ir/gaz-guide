package com.example.thegazdetectormanual

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class main_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val listView: ListView = findViewById(R.id.listView)

        val listItems = listOf(
            ListItem(
                R.drawable.arduino, "arduino",arduino::class.java,
                R.drawable.manual, "manual",manual::class.java
            ),
            ListItem(
                R.drawable.material, "material",objectifs::class.java,
                R.drawable.odd, "odd",odd::class.java
            ),
            ListItem(
                R.drawable.source, "source code",source::class.java,
                R.drawable.staff, "staff members",staff::class.java
            ),
            // Add more items here
        )

        val adapter = CustomAdapter(this, listItems)
        listView.adapter = adapter
    }
}
