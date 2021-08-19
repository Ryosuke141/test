package com.example.test

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        val BaseURL = "http://webservice.recruit.co.jp/hotpepper/large_area/v1/"

        fun getRetroInstance(): Retrofit {

            return Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}