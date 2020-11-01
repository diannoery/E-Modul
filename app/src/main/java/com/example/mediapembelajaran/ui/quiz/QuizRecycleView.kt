package com.example.mediapembelajaran.ui.quiz

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.list_quiz.view.*

class QuizRecycleView(private val MkList : MutableList<MataPelajaran>): RecyclerView.Adapter<MataPelajaranHolder>() {
    lateinit var navController: NavController
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MataPelajaranHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_quiz, parent, false)
        return MataPelajaranHolder(view)
    }

    override fun onBindViewHolder(holder: MataPelajaranHolder, position: Int) {
       val mk = MkList[position].mataPelajaran
        holder.mataPelajan.text=mk

        holder.itemView.Quiz.setOnClickListener{
            if (mk == "Peralatan Pengelolahan Makanan"){
                navController = Navigation.findNavController(it)
                navController.navigate(R.id.action_nav_quiz_to_quizActivity)
            }else if(mk == "Potongan Bahan Makananan"){
                navController = Navigation.findNavController(it)
                navController.navigate(R.id.action_nav_quiz_to_quizDuaActivity)
            }else if(mk == "Teknik Pengolahan Makanan"){
                navController = Navigation.findNavController(it)
                navController.navigate(R.id.action_nav_quiz_to_quizTigaActivity)
            }else if(mk == "Bumbu Dasar dan Turunannya Pada Masakan Indonesia"){
                navController = Navigation.findNavController(it)
                navController.navigate(R.id.action_nav_quiz_to_quizEmpatActivity)
            }



        }

    }

    override fun getItemCount(): Int {
        return MkList.size
    }
}

class MataPelajaranHolder(v: View) : RecyclerView.ViewHolder(v) {
    val mataPelajan = v.findViewById<TextView>(R.id.mk)

}

class MataPelajaran(Mk: String) {
    val mataPelajaran = Mk

}