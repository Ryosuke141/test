package com.example.test

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LargeAreaInfo {

    @GET("/hotpepper/large_area/v1/?key=281c6093222149b3&format=json")
    fun getLargeAreaInfo(): Call<ModelLargeArea>

}