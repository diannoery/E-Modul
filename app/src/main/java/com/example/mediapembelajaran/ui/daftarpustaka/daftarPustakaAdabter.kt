package com.example.mediapembelajaran.ui.daftarpustaka

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R

class DaftarPustakaRecycleView(private var daftarPustaka : MutableList<DaftarPustaka>) : RecyclerView.Adapter<DaftarPustakaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaftarPustakaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_daftar_pustaka, parent, false)
        return DaftarPustakaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DaftarPustakaViewHolder, position: Int) {
       val Daftar = daftarPustaka[position].daftar
        holder.daftar.text=Daftar
    }

    override fun getItemCount(): Int {
       return daftarPustaka.size
    }

}

class DaftarPustakaViewHolder(v:View): RecyclerView.ViewHolder(v) {
    val daftar = v.findViewById<TextView>(R.id.list_daftar)
}
