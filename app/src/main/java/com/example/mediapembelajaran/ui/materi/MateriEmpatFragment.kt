package com.example.mediapembelajaran.ui.materi

import android.app.Dialog
import android.os.AsyncTask
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.mediapembelajaran.R
import com.example.mediapembelajaran.ui.home.HomeFragment
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_materi_empat.*


class MateriEmpatFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi_empat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Materi 4"
        NetworkTask(this).execute()
        textView45.text="Tahap Stimulasi"
        textView46.text="Pada tahap ini kamu diminta untuk  dapat memusatkan perhatian pada materi pembelajaran dengan membaca dan melihat gambar berikut ini:"
        textView47.text="Bumbu Dasar Pada Masakan Indonesia"
        textView48.text="   Pada kegiatan pembelajaran sebelumnya, kamu sudah mempelajari tentang bumbu dan rempah pada masakan Indonesia. Sudah dapatkah kamu membedakan berbagai macam bumbu dan rempah pada masakan Indonesia?\n" +
                "   Amati gambar berikut ini! Jika kamu sudah memahami materi sebelumnya dengan baik, kamu dapat mengikuti kegiatan pembelajaran ini yang masih berhubungan dengan bumbu dan rempah pada masakan Indonesia.\n"
        textView49.text="  Setelah kamu mengamati gambar sebelumnya. Lanjutkanlah pembelajaran dengan mengamati video berikut ini!"
        Picasso.get().load(R.drawable.satu).into(imageView10)
        Picasso.get().load(R.drawable.dua).into(imageView11)
        Picasso.get().load(R.drawable.tiga).into(imageView12)
        Picasso.get().load(R.drawable.empat).into(imageView13)

        val videoId = "R8wZp8FIRrw"
        val youTubePlayerView: YouTubePlayerView = view.findViewById(R.id.materi4_2)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.cueVideo(videoId, 0f)
            }
        })

    }

    class NetworkTask(var activity : MateriEmpatFragment) : AsyncTask<Void, Void, Void>(){

        var dialog = activity.context?.let { Dialog(it, android.R.style.Theme_Translucent_NoTitleBar) }
        override fun onPreExecute() {
            val view= activity.layoutInflater.inflate(R.layout.full_loading,null)
            dialog?.setContentView(view)
            dialog?.setCancelable(false)
            dialog?.show()
            super.onPreExecute()
        }

        override fun doInBackground(vararg p0: Void?): Void? {
            Thread.sleep(2000)
            return null
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            dialog?.dismiss()
        }

    }
}