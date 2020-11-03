package com.example.mediapembelajaran.ui.materi.petunjuk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_petunjuk_kegiatan.*


class PetunjukKegiatanFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_petunjuk_kegiatan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView55.text= "Petunjuk Kegiatan Belajar"
        textView56.text= " Kegiatan belajar pada materi ini terdiri dari 6 (enam) sintak/langkah pembelajaran."
        textView57.text= " Ikutilah langkah-langkah pembelajaran secara berurutan dimulai dari langkah 1 sampai dengan 6."
        textView58.text= " Kerjakanlah setiap tugas yang ada dalam kegiatan pembelajaran secara berurutan sesuai dengan langkah pembelajaran dan buatlah ke dalam bentuk file document yang dapat diunggah pada link berikut ini:"
        textView59.text= " Selamat Belajar!"
    }
}