package com.example.mediapembelajaran.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.makeramen.roundedimageview.RoundedImageView

class HomeRecycleView(val context: HomeFragment): RecyclerView.Adapter<HomeRecycleView.ImageCarouselHolder>() {

    lateinit var list : List<Int>

    fun setContentList (list : List<Int>){
        this.list=list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageCarouselHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_layout, parent, false)
        return ImageCarouselHolder(view)
    }

    override fun onBindViewHolder(holder: HomeRecycleView.ImageCarouselHolder, position: Int) {
//       holder.images.setImageResource(list[position])
    }

    override fun getItemCount(): Int {
       return list.size
    }

   inner class ImageCarouselHolder(v :View) : RecyclerView.ViewHolder(v) {
//        var images = v.findViewById<RoundedImageView>(R.id.viewPager)
    }
}




//class ImageCarousel(image : View , caption : String) {
//    val images = image
//    val caption = caption
//}
