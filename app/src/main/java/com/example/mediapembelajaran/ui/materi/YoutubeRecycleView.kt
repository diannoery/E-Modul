package com.example.mediapembelajaran.ui.materi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class YoutubeRecycleView(private var List_youtube: MutableList<YtId>) :
    RecyclerView.Adapter<YoutubeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_list, parent, false)
        return YoutubeHolder(view)
    }

    override fun onBindViewHolder(holder: YoutubeHolder, position: Int) {
       val videoId = List_youtube[position].Id
        val caption = List_youtube[position].caption
        holder.caption.text= caption
        holder.youtube.addYouTubePlayerListener(object : AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.cueVideo(videoId, 0f)
            }
        })
    }

    override fun getItemCount(): Int {
        return List_youtube.size
    }
}

class YoutubeHolder(v: View) : RecyclerView.ViewHolder(v) {
    val youtube = v.findViewById<YouTubePlayerView>(R.id.youtube_list_view)
    val caption = v.findViewById<TextView>(R.id.caption)
}
