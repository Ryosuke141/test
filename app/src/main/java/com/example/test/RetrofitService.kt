package com.example.test

import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("/hotpepper/large_area/v1/")
    suspend fun getLargeArea(@Query("key") key : String,
                             @Query("format") format : String ): LargeAreaList
}