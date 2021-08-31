package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


/**
 * A simple [Fragment] subclass.
 * Use the [LargeAreaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LargeAreaFragment : Fragment() {

    private lateinit var recyclerAdapter:RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_large_area, container, false)

        initViewModel(view)
        initViewModel()
            return view
    }
    private fun initViewModel(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = RecyclerViewAdapter()
        recyclerView.adapter = recyclerAdapter

    }

    private fun initViewModel(){
        val viewModel = ViewModelProvider(this).get(LargeAreaViewModel::class.java)
        viewModel.getLargeAreaListObserver().observe(this, Observer<LargeAreaResults> {
            if (it != null){
                recyclerAdapter.setUpdatedData(it.results.large_area)
            } else {
                Toast.makeText(activity, "error in getting data", Toast.LENGTH_SHORT).show()
            }

        })
        viewModel.getApiCall()
    }
    companion object {

        @JvmStatic
        fun newInstance() =
            LargeAreaFragment()
    }
}