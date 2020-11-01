package com.example.mediapembelajaran.ui.kidi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_ki_kd_details.*


class KiKdDetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ki_kd_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val KI = arguments?.getString("ki")
        val KD = arguments?.getString("kd")
        val Indikator = arguments?.getString("indikator")
        val Tujuan = arguments?.getString("tujuan")

        KI_data.text=KI
        KD_data.text=KD
        Indikator_data.text=Indikator
        tujuan_data.text=Tujuan


    }
}