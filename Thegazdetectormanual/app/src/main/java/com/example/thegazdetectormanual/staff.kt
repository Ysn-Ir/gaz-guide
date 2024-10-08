package com.example.thegazdetectormanual

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gasdetector.Staf

class staff : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff)


        val recyclerView: RecyclerView = findViewById(R.id.rec)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val staffList = listOf(
            Staf(R.drawable.staff, "YASSINE OUALI", "GRP 4 N 227", "PROGRAMMATION"),
            Staf(R.drawable.staff, "FADLO IDRISSI", "GRP 3 n XXX", "PROGRAMMATION"),
            // Add 12 more staff members here...
            Staf(R.drawable.staff, "BILAL LBIEN", "GRP 3 n XXX", "PROGRAMMATION"),
            Staf(R.drawable.staff, "MOHAMMED LMKHANTER", "GRP3 XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX"),
            Staf(R.drawable.staff, "XXX", "XXX", "XXX")
        )

        val adapter = StaffAdapter(staffList)
        recyclerView.adapter = adapter
    }
}
