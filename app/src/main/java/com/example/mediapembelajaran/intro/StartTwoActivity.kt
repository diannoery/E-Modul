package com.example.mediapembelajaran.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mediapembelajaran.MenuActivity
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.activity_start_two.*

class StartTwoActivity : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_two)
        handler = Handler()
        startToMain.setOnClickListener{
            startToMain.playAnimation()
            handler.postDelayed({
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }

    }
}