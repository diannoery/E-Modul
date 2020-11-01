package com.example.mediapembelajaran.ui.petunjuk

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.RelativeSizeSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_petunjuk.*


class PetunjukFragment : Fragment() {

    val petunjukViewModel by activityViewModels<PetunjukViewModel>()
    lateinit var petunjukRecycleView: PetunjukRecycleView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_petunjuk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val str = "Selamat datang adik-adik sekalian dalam Modul Boga Dasar Berbasis Android Mobile! Agar tidak kebingungan dan tersesat, adik-adik dapat memahami petunjuk penggunaan modul terlebih dahulu. "

//Change first character to capital letter

//Change first character to capital letter
        val tempStr = str.substring(0, 1).toUpperCase() + str.substring(1)

//Change font size of the first character. You can change 2f as you want

//Change font size of the first character. You can change 2f as you want
        val spannableString = SpannableString(tempStr)
        spannableString.setSpan(RelativeSizeSpan(2f), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

//Set the formatted text to text view

//Set the formatted text to text view
        petunjuk_header.setText(spannableString)

        petunjuk.layoutManager= LinearLayoutManager(activity)
        petunjukRecycleView = PetunjukRecycleView(petunjukViewModel.PetunjukLiveData.value!!)
        petunjuk.adapter= petunjukRecycleView
        petunjukViewModel.PetunjukLiveData.observe(viewLifecycleOwner, Observer {
            petunjukRecycleView.notifyDataSetChanged()
        })
    }
}