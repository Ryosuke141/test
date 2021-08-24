package com.example.test

import retrofit2.http.GET
import retrofit2.http.Query

interface LargeAreaInfo {

    @GET("large_area/v1/")
    fun getLargeAreaInf(@Query("key") key : String,
                        @Query("format") format : String)

}