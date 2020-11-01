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
import kotlinx.android.synthetic.main.fragment_quiz_materi_dua.*
import kotlinx.android.synthetic.main.fragment_quiz_materi_dua.pertanyaan2
import kotlinx.android.synthetic.main.fragment_quiz_materi_dua.timer2
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.*


class QuizMateriTigaFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_quiz_materi_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Timer
        timer3.base= SystemClock.elapsedRealtime()+times
        timer3.start()

        pertanyaan3.text = "${soal + 1}. ${mkViewModel.KuisMateriTiga[soal].quiz}"
        button1_3.text = " A. ${mkViewModel.KuisMateriTiga[soal].A}"
        button2_3.text = " B. ${mkViewModel.KuisMateriTiga[soal].B}"
        button3_3.text = " C. ${mkViewModel.KuisMateriTiga[soal].C}"
        button4_3.text = " D. ${mkViewModel.KuisMateriTiga[soal].D}"
        button5_3.text = " E. ${mkViewModel.KuisMateriTiga[soal].E}"
        submit_3.visibility = View.INVISIBLE

        button1_3.setOnClickListener {
            if (pilihA) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriTiga[soal].A == mkViewModel.KuisMateriTiga[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_3.visibility = View.INVISIBLE
            } else {
                pilihA = true
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_bg)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].A == mkViewModel.KuisMateriTiga[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_3.text= "submit"
                }
                submit_3.visibility = View.VISIBLE

            }



        }
        button2_3.setOnClickListener {
            if (pilihB) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE =false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].B == mkViewModel.KuisMateriTiga[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit_3.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = true
                pilihC = false
                pilihD = false
                pilihE =false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_bg)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].B == mkViewModel.KuisMateriTiga[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_3.text= "submit"
                }
                submit_3.visibility = View.VISIBLE
            }


        }
        button3_3.setOnClickListener {

            if (pilihC) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].C == mkViewModel.KuisMateriTiga[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_3.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = true
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_bg)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].C == mkViewModel.KuisMateriTiga[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_3.text= "submit"
                }
                submit_3.visibility = View.VISIBLE
            }


        }
        button4_3.setOnClickListener {
            if (pilihD) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].D == mkViewModel.KuisMateriTiga[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_3.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = true
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_bg)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].D == mkViewModel.KuisMateriTiga[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit_3.text= "submit"
                }
                submit_3.visibility = View.VISIBLE
            }


        }
        button5_3.setOnClickListener {
            if (pilihE) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.KuisMateriTiga[soal].D == mkViewModel.KuisMateriTiga[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_3.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = true
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_bg)
                if (mkViewModel.KuisMateriTiga[soal].E == mkViewModel.KuisMateriTiga[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit_3.text= "submit"
                }
                submit_3.visibility = View.VISIBLE
            }
        }

        submit_3.setOnClickListener {
            if (soal < mkViewModel.KuisMateriTiga.size - 1) {
                soal++
                println(soal)
                Data.add(Benar)
                Benar= 0
                pertanyaan3.text = "${soal + 1}. ${mkViewModel.KuisMateriTiga[soal].quiz}"
                button1_3.text = " A. ${mkViewModel.KuisMateriTiga[soal].A}"
                button2_3.text = " B. ${mkViewModel.KuisMateriTiga[soal].B}"
                button3_3.text = " C. ${mkViewModel.KuisMateriTiga[soal].C}"
                button4_3.text = " D. ${mkViewModel.KuisMateriTiga[soal].D}"
                button5_3.text = " E. ${mkViewModel.KuisMateriTiga[soal].E}"
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_3.setBackgroundResource(R.drawable.shape_white)
                button2_3.setBackgroundResource(R.drawable.shape_white)
                button3_3.setBackgroundResource(R.drawable.shape_white)
                button4_3.setBackgroundResource(R.drawable.shape_white)
                button5_3.setBackgroundResource(R.drawable.shape_white)
                submit_3.visibility = View.INVISIBLE
                if (soal+1 == 12 ){
                    soalImage3.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.poaching).into(soalImage3)
                }else {
                    soalImage3.visibility = View.INVISIBLE
                }
            } else {
                times =timer3.base- SystemClock.elapsedRealtime()
                timer3.stop()

                var waktu = timer3.text

                var jmlhSoal = mkViewModel.KuisMateriTiga.size
                var jmlhBenar = 0
                Data.add(Benar)
                for (i in Data){
                    jmlhBenar+= i
                }
                skor = (jmlhBenar * 100) / jmlhSoal
                Salah = jmlhSoal- jmlhBenar
                navController = Navigation.findNavController(it)
                navController.navigate(
                    R.id.action_quizMateriTigaFragment_to_resultFragment3,
                    bundleOf("Skor" to skor, "Benar" to jmlhBenar, "Salah" to Salah,"Waktu" to waktu , "quiz" to "quiz3")
                )

            }
        }
    }
}