package com.example.mediapembelajaran.ui.pendahuluan

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.RelativeSizeSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_pendahuluan.*
import kotlinx.android.synthetic.main.fragment_petunjuk.*

class PendahuluanFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pendahuluan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val str = "Modul pembelajaran Boga Dasar dengan model pembelajaran Discovery Learning ini dikemas dalam bentuk aplikasi berbasis android yang dapat diunduh melalui Google Play Store. Modul android ini dirancang untuk memfasilitasi peserta didik dalam belajar mandiri. Sifatnya yang flexible dan self-instructional menjadikan pembelajaran lebih mudah dilakukan dimana pun dan kapan pun."
        val tempStr = str.substring(0, 1).toUpperCase() + str.substring(1)
        val spannableString = SpannableString(tempStr)
        spannableString.setSpan(RelativeSizeSpan(5f), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        Pendahuluan.setText(spannableString)
    }
}