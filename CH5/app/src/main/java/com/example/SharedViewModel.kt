package com.example
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
class SharedViewModel : ViewModel() {

    val sharedData = MutableLiveData<String>()

}
