package com.example.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LargeAreaViewModel : ViewModel() {
    lateinit var largeAreaListLiveData : MutableLiveData<LargeAreaList>

    init {
        largeAreaListLiveData = MutableLiveData()
    }

    fun getLargeAreaListObserver(): MutableLiveData<LargeAreaList>{
        return largeAreaListLiveData
    }

    fun getApiCall(){
        viewModelScope.launch(Dispatchers.IO) {
            val retrofitInstance = RetrofitInstance.getRetroInstance().create(RetrofitService::class.java)
            val response = retrofitInstance.getLargeArea("281c6093222149b3")
            largeAreaListLiveData.postValue(response)
        }
    }
}