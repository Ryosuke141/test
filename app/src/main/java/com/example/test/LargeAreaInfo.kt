package com.example.test

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "http://webservice.recruit.co.jp"

private val moshi =


interface LargeAreaInfo {

    @GET("/hotpepper/large_area/v1/")
    fun getLargeAreaInfo(@Query("key") key : String = "281c6093222149b3",
                         @Query("format") format : String = "json"): Call<List<ModelLargeArea>>

}