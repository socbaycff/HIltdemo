package com.example.myapplication

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(val fakeFirebase: FakeFirebase): ViewModel() {
    val myLiveData = MutableLiveData("default")
}