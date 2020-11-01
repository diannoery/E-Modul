package com.example.mediapembelajaran.ui.petunjuk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.example.mediapembelajaran.ui.quiz.MataPelajaran
import kotlinx.android.synthetic.main.list_quiz.view.*


class PetunjukRecycleView(private val PetunjukList : MutableList<Petunjuk>): RecyclerView.Adapter<PetunjukHolder>() {
    lateinit var navController: NavController
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetunjukHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_petunjuk, parent, false)
        return PetunjukHolder(view)
    }

    override fun onBindViewHolder(holder: PetunjukHolder, position: Int) {
        val Langkah = PetunjukList[position].langkah
        val Isi = PetunjukList[position].isi

        holder.langkah.text=Langkah
        holder.isi.text=Isi

    }

    override fun getItemCount(): Int {
        return PetunjukList.size
    }
}

class PetunjukHolder(v: View) : RecyclerView.ViewHolder(v) {
    val langkah = v.findViewById<TextView>(R.id.langkah)
    val isi = v.findViewById<TextView>(R.id.isi)

}