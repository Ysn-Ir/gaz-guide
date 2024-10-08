package com.example.thegazdetectormanual

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gasdetector.Staf

class StaffAdapter(private val staffList: List<Staf>) :
    RecyclerView.Adapter<StaffAdapter.StaffViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaffViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_staff, parent, false)
        return StaffViewHolder(view)
    }

    override fun onBindViewHolder(holder: StaffViewHolder, position: Int) {
        val staff = staffList[position]
        holder.staffImage.setImageResource(staff.imageResId)
        holder.staffName.text = staff.name
        holder.staffNumber.text = staff.number
        holder.staffSubText.text = staff.subText
    }

    override fun getItemCount(): Int {
        return staffList.size
    }

    class StaffViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val staffImage: ImageView = itemView.findViewById(R.id.staffImage)
        val staffName: TextView = itemView.findViewById(R.id.staffName)
        val staffNumber: TextView = itemView.findViewById(R.id.staffNumber)
        val staffSubText: TextView = itemView.findViewById(R.id.staffSubText)
    }
}
