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
import kotlinx.android.synthetic.main.fragment_quiz_materi_empat.*
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.*
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.button1_3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.button2_3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.button3_3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.button4_3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.button5_3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.pertanyaan3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.submit_3
import kotlinx.android.synthetic.main.fragment_quiz_materi_tiga.timer3


class QuizMateriEmpatFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_quiz_materi_empat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Timer
        timer4.base= SystemClock.elapsedRealtime()+times
        timer4.start()

        pertanyaan4.text = "${soal + 1}. ${mkViewModel.KuisMateriEmpat[soal].quiz}"
        button1_4.text = " A. ${mkViewModel.KuisMateriEmpat[soal].A}"
        button2_4.text = " B. ${mkViewModel.KuisMateriEmpat[soal].B}"
        button3_4.text = " C. ${mkViewModel.KuisMateriEmpat[soal].C}"
        button4_4.text = " D. ${mkViewModel.KuisMateriEmpat[soal].D}"

        submit_4.visibility = View.INVISIBLE
        gambarA.visibility= View.GONE
        imageA.visibility = View.GONE
        gambarB.visibility= View.GONE
        imageB.visibility = View.GONE
        gambarC.visibility= View.GONE
        imageC.visibility = View.GONE
        gambarD.visibility= View.GONE
        imageD.visibility = View.GONE

        button1_4.setOnClickListener {
            if (pilihA) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)


                if (mkViewModel.KuisMateriEmpat[soal].A == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = true
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_4.setBackgroundResource(R.drawable.shape_bg)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].A == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE

            }



        }
        button2_4.setOnClickListener {
            if (pilihB) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE =false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].B == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = true
                pilihC = false
                pilihD = false
                pilihE =false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_bg)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].B == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE
            }


        }
        button3_4.setOnClickListener {

            if (pilihC) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].C == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = true
                pilihD = false
                pilihE = false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_bg)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].C == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE
            }


        }
        button4_4.setOnClickListener {
            if (pilihD) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].D == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = true
                pilihE = false
                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_bg)

                if (mkViewModel.KuisMateriEmpat[soal].D == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE
            }


        }
        imageA.setOnClickListener {
            if (pilihA) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                gambarA.setBackgroundResource(R.drawable.shape_white)
                gambarB.setBackgroundResource(R.drawable.shape_white)
                gambarC.setBackgroundResource(R.drawable.shape_white)
                gambarD.setBackgroundResource(R.drawable.shape_white)


                if (mkViewModel.KuisMateriEmpat[soal].A == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = true
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE = false
                gambarA.setBackgroundResource(R.drawable.shape_bg)
                gambarB.setBackgroundResource(R.drawable.shape_white)
                gambarC.setBackgroundResource(R.drawable.shape_white)
                gambarD.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].A == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE

            }

        }
        imageB.setOnClickListener {
            if (pilihB) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE =false
                gambarA.setBackgroundResource(R.drawable.shape_white)
                gambarB.setBackgroundResource(R.drawable.shape_white)
                gambarC.setBackgroundResource(R.drawable.shape_white)
                gambarD.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].B == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = true
                pilihC = false
                pilihD = false
                pilihE =false
                gambarA.setBackgroundResource(R.drawable.shape_white)
                gambarB.setBackgroundResource(R.drawable.shape_bg)
                gambarC.setBackgroundResource(R.drawable.shape_white)
                gambarD.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].B == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE
            }
        }
        imageC.setOnClickListener {
            if (pilihC) {
            pilihA = false
            pilihB = false
            pilihC = false
            pilihD = false
            pilihE =false
            gambarA.setBackgroundResource(R.drawable.shape_white)
            gambarB.setBackgroundResource(R.drawable.shape_white)
            gambarC.setBackgroundResource(R.drawable.shape_white)
            gambarD.setBackgroundResource(R.drawable.shape_white)

            if (mkViewModel.KuisMateriEmpat[soal].C == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                Benar--
            }

            submit_4.visibility = View.INVISIBLE
        } else {
            pilihA = false
            pilihB = false
            pilihC = true
            pilihD = false
            pilihE =false
            gambarA.setBackgroundResource(R.drawable.shape_white)
            gambarB.setBackgroundResource(R.drawable.shape_white)
            gambarC.setBackgroundResource(R.drawable.shape_bg)
            gambarD.setBackgroundResource(R.drawable.shape_white)

            if (mkViewModel.KuisMateriEmpat[soal].C == mkViewModel.KuisMateriEmpat[soal].Answer) {
                Benar++

            }else{
                if (Benar !=0){
                    Benar--
                }
            }
            if (soal +1 == 20){
                submit_4.text= "submit"
            }
            submit_4.visibility = View.VISIBLE
        }
        }
        imageD.setOnClickListener {
            if (pilihD) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false
                pilihE =false
                gambarA.setBackgroundResource(R.drawable.shape_white)
                gambarB.setBackgroundResource(R.drawable.shape_white)
                gambarC.setBackgroundResource(R.drawable.shape_white)
                gambarD.setBackgroundResource(R.drawable.shape_white)

                if (mkViewModel.KuisMateriEmpat[soal].D == mkViewModel.KuisMateriEmpat[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit_4.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = true
                pilihE =false
                gambarA.setBackgroundResource(R.drawable.shape_white)
                gambarB.setBackgroundResource(R.drawable.shape_white)
                gambarC.setBackgroundResource(R.drawable.shape_white)
                gambarD.setBackgroundResource(R.drawable.shape_bg)

                if (mkViewModel.KuisMateriEmpat[soal].D == mkViewModel.KuisMateriEmpat[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 20){
                    submit_4.text= "submit"
                }
                submit_4.visibility = View.VISIBLE
            }
        }

        submit_4.setOnClickListener {
            if (soal < mkViewModel.KuisMateriEmpat.size - 1) {
                soal++
                println(soal)
                Data.add(Benar)
                Benar= 0
                pertanyaan4.text = "${soal + 1}. ${mkViewModel.KuisMateriEmpat[soal].quiz}"
                button1_4.text = " A. ${mkViewModel.KuisMateriEmpat[soal].A}"
                button2_4.text = " B. ${mkViewModel.KuisMateriEmpat[soal].B}"
                button3_4.text = " C. ${mkViewModel.KuisMateriEmpat[soal].C}"
                button4_4.text = " D. ${mkViewModel.KuisMateriEmpat[soal].D}"

                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false

                button1_4.setBackgroundResource(R.drawable.shape_white)
                button2_4.setBackgroundResource(R.drawable.shape_white)
                button3_4.setBackgroundResource(R.drawable.shape_white)
                button4_4.setBackgroundResource(R.drawable.shape_white)

                submit_4.visibility = View.INVISIBLE
                if (soal+1 == 7 ){
                    gambarA.visibility= View.VISIBLE
                    imageA.visibility = View.VISIBLE
                    gambarB.visibility= View.VISIBLE
                    imageB.visibility = View.VISIBLE
                    gambarC.visibility= View.VISIBLE
                    imageC.visibility = View.VISIBLE
                    gambarD.visibility= View.VISIBLE
                    imageD.visibility = View.VISIBLE
                    button1_4.visibility=View.GONE
                    button2_4.visibility=View.GONE
                    button3_4.visibility=View.GONE
                    button4_4.visibility=View.GONE
                }else if (soal+1 == 8){
                    gambarA.visibility= View.GONE
                    imageA.visibility = View.GONE
                    gambarB.visibility= View.GONE
                    imageB.visibility = View.GONE
                    gambarC.visibility= View.GONE
                    imageC.visibility = View.GONE
                    gambarD.visibility= View.GONE
                    imageD.visibility = View.GONE
                    button1_4.visibility=View.VISIBLE
                    button2_4.visibility=View.VISIBLE
                    button3_4.visibility=View.VISIBLE
                    button4_4.visibility=View.VISIBLE
                    soalImage4.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.kunyit).into(soalImage4)
                }else if (soal+1 == 10){
                    soalImage4.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.cengkeh).into(soalImage4)
                }else if (soal+1 == 11){
                    soalImage4.visibility = View.VISIBLE
                    Picasso.get().load(R.drawable.kemiri).into(soalImage4)
                }else {
                    gambarA.visibility= View.GONE
                    imageA.visibility = View.GONE
                    gambarB.visibility= View.GONE
                    imageB.visibility = View.GONE
                    gambarC.visibility= View.GONE
                    imageC.visibility = View.GONE
                    gambarD.visibility= View.GONE
                    imageD.visibility = View.GONE
                    button1_4.visibility=View.VISIBLE
                    button2_4.visibility=View.VISIBLE
                    button3_4.visibility=View.VISIBLE
                    button4_4.visibility=View.VISIBLE
                    soalImage4.visibility = View.INVISIBLE
                }
            } else {
                times =timer4.base- SystemClock.elapsedRealtime()
                timer4.stop()

                var waktu = timer4.text

                var jmlhSoal = mkViewModel.KuisMateriEmpat.size
                var jmlhBenar = 0
                Data.add(Benar)
                for (i in Data){
                    jmlhBenar+= i
                }
                skor = (jmlhBenar * 100) / jmlhSoal
                Salah = jmlhSoal- jmlhBenar
                navController = Navigation.findNavController(it)
                navController.navigate(
                    R.id.action_quizMateriEmpatFragment_to_resultFragment4,
                    bundleOf("Skor" to skor, "Benar" to jmlhBenar, "Salah" to Salah,"Waktu" to waktu , "quiz" to "quiz4")
                )

            }
        }
    }
}