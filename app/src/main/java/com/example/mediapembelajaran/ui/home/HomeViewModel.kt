package com.example.mediapembelajaran.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mediapembelajaran.R

class HomeViewModel : ViewModel() {
    var image = intArrayOf(R.drawable.wp1, R.drawable.wp2, R.drawable.wp3, R.drawable.wp4,)

    var caption = arrayOf("wp1","wp2","wp3","wp4")
    private val _text = MutableLiveData<String>().apply {
        value = "E-MODUL"
    }
    val text: LiveData<String> = _text
}