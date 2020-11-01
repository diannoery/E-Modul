package com.example.mediapembelajaran.ui.quiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.core.view.isInvisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mediapembelajaran.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_question.*
import kotlinx.android.synthetic.main.fragment_quiz_materi_dua.*
import java.sql.Time


class QuestionFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Timer
        timer.base= SystemClock.elapsedRealtime()+times
        timer.start()


        pertanyaan.text = "${soal + 1}. ${mkViewModel.kuisMateriSatu[soal].quiz}"
        button1.text = " A. ${mkViewModel.kuisMateriSatu[soal].A}"
        button2.text = " B. ${mkViewModel.kuisMateriSatu[soal].B}"
        button3.text = " C. ${mkViewModel.kuisMateriSatu[soal].C}"
        button4.text = " D. ${mkViewModel.kuisMateriSatu[soal].D}"
        button5.text = " E. ${mkViewModel.kuisMateriSatu[soal].E}"
        submit.visibility = View.INVISIBLE

        button1.setOnClickListener {
            if (pilihA) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.kuisMateriSatu[soal].A == mkViewModel.kuisMateriSatu[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = true
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_bg)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].A == mkViewModel.kuisMateriSatu[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE

            }



        }
        button2.setOnClickListener {
            if (pilihB) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE =false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].B == mkViewModel.kuisMateriSatu[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = true
                pilihC = false
                pilihD = false
                pilihE =false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_bg)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].B == mkViewModel.kuisMateriSatu[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }


        }
        button3.setOnClickListener {

            if (pilihC) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].C == mkViewModel.kuisMateriSatu[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = true
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_bg)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].C == mkViewModel.kuisMateriSatu[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }


        }
        button4.setOnClickListener {
            if (pilihD) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].D == mkViewModel.kuisMateriSatu[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = true
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_bg)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].D == mkViewModel.kuisMateriSatu[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }


        }
        button5.setOnClickListener {
            if (pilihE) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                if (mkViewModel.kuisMateriSatu[soal].D == mkViewModel.kuisMateriSatu[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = true
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_bg)
                if (mkViewModel.kuisMateriSatu[soal].E == mkViewModel.kuisMateriSatu[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }
        }
        if (soal == mkViewModel.kuisMateriSatu.size - 1 ){
            submit.text= "Submit"
        }
        submit.setOnClickListener {
            if (soal < mkViewModel.kuisMateriSatu.size - 1) {
                soal++
                println(soal)
                Data.add(Benar)
                Benar= 0
                pertanyaan.text = "${soal + 1}. ${mkViewModel.kuisMateriSatu[soal].quiz}"
                button1.text = " A. ${mkViewModel.kuisMateriSatu[soal].A}"
                button2.text = " B. ${mkViewModel.kuisMateriSatu[soal].B}"
                button3.text = " C. ${mkViewModel.kuisMateriSatu[soal].C}"
                button4.text = " D. ${mkViewModel.kuisMateriSatu[soal].D}"
                button5.text = " E. ${mkViewModel.kuisMateriSatu[soal].E}"
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)
                button5.setBackgroundResource(R.drawable.shape_white)
                submit.visibility = View.INVISIBLE
                if (soal+1 == 12 ){
                    soalImage.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.meatgrinder).into(soalImage)
                } else if (soal + 1 == 17) {
                    soalImage.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.utensil).into(soalImage)
                } else {
                    soalImage.visibility = View.INVISIBLE
                }
            } else {
                times =timer.base-SystemClock.elapsedRealtime()
                timer.stop()

                var waktu = timer.text

                var jmlhSoal = mkViewModel.kuisMateriSatu.size
                var jmlhBenar = 0
                Data.add(Benar)
                for (i in Data){
                   jmlhBenar+= i
                }
                skor = (jmlhBenar * 100) / jmlhSoal
                Salah = jmlhSoal- jmlhBenar
                navController = Navigation.findNavController(it)
                navController.navigate(
                    R.id.action_questionFragment_to_resultFragment,
                    bundleOf("Skor" to skor, "Benar" to jmlhBenar, "Salah" to Salah,"Waktu" to waktu, "quiz" to "quiz1")
                )

            }
        }


    }


}