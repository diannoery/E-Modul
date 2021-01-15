package com.example.mediapembelajaran.ui.kidi

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.google.android.material.internal.ContextUtils.getActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_kddi.view.*

class KikdRecycleView(private var dataKikd : MutableList<KiKdList>): RecyclerView.Adapter<KikdViewHolder>() {

    lateinit var navController: NavController

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KikdViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_kddi, parent, false)
        return KikdViewHolder(view)
    }

    override fun onBindViewHolder(holder: KikdViewHolder, position: Int) {
        val list_materi = dataKikd[position].kikd_list
        val KI = dataKikd[position].ki
        val KD = dataKikd[position].kd
        val Indikator = dataKikd[position].indikator
        val Tujuan = dataKikd[position].tujuan

        holder.Kikd.text = list_materi
        if (list_materi == "Peralatan Pengelolahan Makanan"){
            Picasso.get().load(R.drawable.materi4).fit().into(holder.image)
        } else if (list_materi == "Potongan Bahan Makananan"){
            Picasso.get().load(R.drawable.materi3).fit().into(holder.image)
        }else if (list_materi == "Teknik Pengolahan Makanan"){
            Picasso.get().load(R.drawable.materi2).fit().centerCrop().into(holder.image)
        }else if (list_materi == "Bumbu Dasar dan Turunannya Pada Masakan Indonesia"){
            Picasso.get().load(R.drawable.materi1).into(holder.image)
        }
        val activity = holder.itemView.context as Activity
        holder.itemView.kikd.setOnClickListener{
            //Toast.makeText(activity, "Click KI & KD", Toast.LENGTH_SHORT).show()
            navController = Navigation.findNavController(it)
            navController.navigate(
                R.id.action_nav_kikd_to_kiKdDetailsFragment,
                bundleOf("ki" to KI , "kd" to KD, "indikator" to Indikator, "tujuan" to Tujuan)
            )

        }
    }

    override fun getItemCount(): Int {
       return dataKikd.size
    }
}

class KikdViewHolder(v : View): RecyclerView.ViewHolder(v) {
    val Kikd = v.findViewById<TextView>(R.id.Materi)
    val image = v.findViewById<ImageView>(R.id.imageKiKD)
}
