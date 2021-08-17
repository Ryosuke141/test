package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() , RecyclerViewHolder.ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val hoges = resources.getStringArray(R.array.hoges).toMutableList()

        mainRecyclerView.adapter = RecyclerAdapter(this, this, hoges)
        mainRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}