package com.example.test

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    interface ItemClickListener{
        fun onItemClick(view: View,position: Int)
    }

    val itemTextView: TextView = view.findViewById(R.id.itemTextView)
    val itemImageView: ImageView = view.findViewById(R.id.itemImageView)


}