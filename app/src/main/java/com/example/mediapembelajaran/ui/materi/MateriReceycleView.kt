package com.example.mediapembelajaran.ui.materi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.squareup.picasso.Picasso

class MateriReceycleView(private var materi: MutableList<MateriList>) :
    RecyclerView.Adapter<MateriHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_kddi, parent, false)
        return MateriHolder(view)
    }

    override fun onBindViewHolder(holder: MateriHolder, position: Int) {
        val list_materi = materi[position].materi_list
        holder.materi.text = list_materi
       if (list_materi == "Peralatan Pengelolahan Makanan"){
           Picasso.get().load(R.drawable.alatmasak).into(holder.image)
       } else if (list_materi == "Potongan Bahan Makananan"){
           Picasso.get().load(R.drawable.potongan).into(holder.image)
       }else if (list_materi == "Teknik Pengolahan Makanan"){
           Picasso.get().load(R.drawable.cooking).into(holder.image)
       }else if (list_materi == "Bumbu Dasar dan Turunannya Pada Masakan Indonesia"){
           Picasso.get().load(R.drawable.bumbu).into(holder.image)
       }
    }

    override fun getItemCount(): Int {
        return materi.size
    }
}

class MateriHolder(v: View) : RecyclerView.ViewHolder(v) {
    val materi = v.findViewById<TextView>(R.id.Materi)
    val image = v.findViewById<ImageView>(R.id.imageKiKD)
}
