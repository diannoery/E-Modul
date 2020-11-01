package com.example.mediapembelajaran.ui.quiz

import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mediapembelajaran.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_question.*
import kotlinx.android.synthetic.main.fragment_quiz_materi_dua.*


class QuizMateriDuaFragment : Fragment() {
    lateinit var navController: NavController
    val mkViewModel by activityViewModels<QuizViewModel>()
    private var pilihA = false
    private var pilihB = false
    private var pilihC = false
    private var pilihD = false
    private var pilihE = false
    private var soal = 0
    private var skor = 0
    private var Benar = 0
    private var Data = mutableListOf<Int>()
    private var Salah = 0
    var times : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_materi_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Timer
        timer2.base= SystemClock.elapsedRealtime()+times
        timer2.start()

        pertanyaan2.text = "${soal + 1}. ${mkViewModel.KuisMateriDua[soal].quiz}"
        button1_2.text = " A. ${mkViewModel.KuisMateriDua[soal].A}"
        button2_2.text = " B. ${mkViewModel.KuisMateriDua[soal].B}"
        button3_2.text = " C. ${mkViewModel.KuisMateriDua[soal].C}"
        button4_2.text = " D. ${mkViewModel.KuisMateriDua[soal].D}"
        button5_2.text = " E. ${mkViewModel.KuisMateriDua[soal].E}"
        submit_2.visibility = View.INVISIBLE

        button1_2.setOnClickListener {
            if (pilihA) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriDua[soal].A == mkViewModel.KuisMateriDua[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_2.visibility = View.INVISIBLE
            } else {
                pilihA = true
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_bg)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].A == mkViewModel.KuisMateriDua[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_2.text= "submit"
                }
                submit_2.visibility = View.VISIBLE

            }



        }
        button2_2.setOnClickListener {
            if (pilihB) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE =false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].B == mkViewModel.KuisMateriDua[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit_2.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = true
                pilihC = false
                pilihD = false
                pilihE =false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_bg)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].B == mkViewModel.KuisMateriDua[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_2.text= "submit"
                }
                submit_2.visibility = View.VISIBLE
            }


        }
        button3_2.setOnClickListener {

            if (pilihC) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].C == mkViewModel.KuisMateriDua[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_2.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = true
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_bg)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].C == mkViewModel.KuisMateriDua[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_2.text= "submit"
                }
                submit_2.visibility = View.VISIBLE
            }


        }
        button4_2.setOnClickListener {
            if (pilihD) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].D == mkViewModel.KuisMateriDua[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_2.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = true
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_bg)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].D == mkViewModel.KuisMateriDua[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit_2.text= "submit"
                }
                submit_2.visibility = View.VISIBLE
            }


        }
        button5_2.setOnClickListener {
            if (pilihE) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriDua[soal].D == mkViewModel.KuisMateriDua[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_2.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = true
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_bg)
                if (mkViewModel.KuisMateriDua[soal].E == mkViewModel.KuisMateriDua[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit_2.text= "submit_2"
                }
                submit_2.visibility = View.VISIBLE
            }
        }

        submit_2.setOnClickListener {
            if (soal < mkViewModel.KuisMateriDua.size - 1) {
                soal++
                println(soal)
                Data.add(Benar)
                Benar= 0
                pertanyaan2.text = "${soal + 1}. ${mkViewModel.KuisMateriDua[soal].quiz}"
                button1_2.text = " A. ${mkViewModel.KuisMateriDua[soal].A}"
                button2_2.text = " B. ${mkViewModel.KuisMateriDua[soal].B}"
                button3_2.text = " C. ${mkViewModel.KuisMateriDua[soal].C}"
                button4_2.text = " D. ${mkViewModel.KuisMateriDua[soal].D}"
                button5_2.text = " E. ${mkViewModel.KuisMateriDua[soal].E}"
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_2.setBackgroundResource(R.drawable.shape_white)
                button2_2.setBackgroundResource(R.drawable.shape_white)
                button3_2.setBackgroundResource(R.drawable.shape_white)
                button4_2.setBackgroundResource(R.drawable.shape_white)
                button5_2.setBackgroundResource(R.drawable.shape_white)
                submit_2.visibility = View.INVISIBLE
                if (soal+1 == 8 ){
                    soalImage2.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.chopped).into(soalImage2)
                } else if (soal + 1 == 11) {
                    soalImage2.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.paysanne).into(soalImage2)
                }else if (soal + 1 == 15) {
                    soalImage2.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.potato).into(soalImage2)
                }else {
                    soalImage2.visibility = View.INVISIBLE
                }
            } else {
                times =timer2.base-SystemClock.elapsedRealtime()
                timer2.stop()

                var waktu = timer2.text

                var jmlhSoal = mkViewModel.KuisMateriDua.size
                var jmlhBenar = 0
                Data.add(Benar)
                for (i in Data){
                    jmlhBenar+= i
                }
                skor = (jmlhBenar * 100) / jmlhSoal
                Salah = jmlhSoal- jmlhBenar
                navController = Navigation.findNavController(it)
                navController.navigate(
                    R.id.action_quizMateriDuaFragment_to_resultFragment2,
                    bundleOf("Skor" to skor, "Benar" to jmlhBenar, "Salah" to Salah,"Waktu" to waktu , "quiz" to "quiz2")
                )

            }
        }

    }
}