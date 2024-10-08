package com.example.thegazdetectormanual

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CustomAdapter(private val context: Context, private val dataSource: List<ListItem>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = convertView ?: inflater.inflate(R.layout.list_item, parent, false)

        val item1ImageView = rowView.findViewById<ImageView>(R.id.item1ImageView)
        val item1TitleTextView = rowView.findViewById<TextView>(R.id.item1TitleTextView)

        val item2ImageView = rowView.findViewById<ImageView>(R.id.item2ImageView)
        val item2TitleTextView = rowView.findViewById<TextView>(R.id.item2TitleTextView)

        val listItem = getItem(position) as ListItem

        item1ImageView.setImageResource(listItem.image1ResId)
        item1TitleTextView.text = listItem.title1

        item2ImageView.setImageResource(listItem.image2ResId)
        item2TitleTextView.text = listItem.title2
        // Set click listener for the first image
        item1ImageView.setOnClickListener {
            navigateToDestination(listItem.destinationActivity1)
        }

        // Set click listener for the second image
        item2ImageView.setOnClickListener {
            navigateToDestination(listItem.destinationActivity2)
        }

        return rowView
    }
    private fun navigateToDestination(destinationActivity: Class<*>) {
        val intent = Intent(context, destinationActivity)
        context.startActivity(intent)
    }
}
