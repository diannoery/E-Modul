package com.example.mediapembelajaran.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mediapembelajaran.MenuActivity
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.activity_start.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartActivity : AppCompatActivity() {
   lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)



        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, StartTwoActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)

    }



}