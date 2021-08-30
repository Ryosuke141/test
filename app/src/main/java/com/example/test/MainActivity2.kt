package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity2 : AppCompatActivity() {

    private var TAG = "MainActivity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        getLargeAreaData()
    }

    private fun getLargeAreaData(){

        val api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LargeAreaInfo::class.java)

        GlobalScope.launch(Dispatchers.IO) {
            val response : Response<List<ModelLargeArea>> = api.getLargeAreaInfo().awaitResponse()
            if (response.isSuccessful){
                val data : ModelLargeArea = response.body()!!
                Log.d(TAG, data.name)

                withContext(Dispatchers.Main){
                    nameLargeArea.visibility = View.VISIBLE

                    nameLargeArea.text = data.name
                }
            }
        }

    }
}