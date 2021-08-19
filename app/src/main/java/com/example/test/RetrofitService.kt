package com.example.test

import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("")
    suspend fun getLargeArea(@Query("key") key : String): LargeAreaList
}