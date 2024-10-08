package com.example.thegazdetectormanual
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MaterialAdapter(private val context: Context, private val materials: List<Material>) : BaseAdapter() {

    override fun getCount(): Int = materials.size

    override fun getItem(position: Int): Material = materials[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_material, parent, false)
        val material = getItem(position)

        val imageView: ImageView = view.findViewById(R.id.material_image)
        val nameTextView: TextView = view.findViewById(R.id.material_name)
        val descriptionTextView: TextView = view.findViewById(R.id.material_description)
        val priceTextView: TextView = view.findViewById(R.id.material_price)

        imageView.setImageResource(material.imageResId)
        nameTextView.text = material.name
        descriptionTextView.text = material.description
        priceTextView.text = material.price

        imageView.setOnClickListener {
            descriptionTextView.visibility = if (descriptionTextView.visibility == View.GONE) View.VISIBLE else View.GONE
            priceTextView.visibility = if (priceTextView.visibility == View.GONE) View.VISIBLE else View.GONE
        }

        return view
    }
}
