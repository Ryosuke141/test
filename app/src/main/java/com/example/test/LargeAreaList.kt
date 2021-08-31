package com.example.test

data class LargeAreaResults(val results : LargeAreaList)
data class LargeAreaList(val large_area : ArrayList<LargeAreaData>)
data class LargeAreaData(val code : String, val name: String)