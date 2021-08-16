package com.example.test

import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val largeAreaList: ArrayList<LargeArea>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val name : TextView

        init {
            name = view.findViewById(R.id.)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LinearLayout.from(viewGroup.context).inflate(R.id., viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val largeArea = largeAreaList[position]

        holder.name.text = largeArea.name
    }

    override fun getItemCount() = largeAreaList.size


}