package com.example.dz1

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val text = view.findViewById<TextView>(R.id.text_1)
    val image = view.findViewById<ImageView>(R.id.image_view)

    fun bind(number: Int) {
        text.text = "$number"
        val color = when {
            number % 2 == 0 -> Color.parseColor("#F44336")
            else -> Color.parseColor("#03A9F4")
        }
        image.setBackgroundColor(color)
    }
}