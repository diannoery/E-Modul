package com.example.mediapembelajaran.ui.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var Skor = arguments?.getInt("Skor")
        var Benar = arguments?.getInt("Benar")
        var Salah = arguments?.getInt("Salah")
        var waktu = arguments?.getString("Waktu")
        var quiz = arguments?.getString("quiz")
        skor.text=Skor.toString()
        Benar_skor.text=Benar.toString()
        Salah_skor.text=Salah.toString()
        waktu_selesai.text=waktu.toString()

        home.setOnClickListener {
          if (quiz == "quiz1"){
              navController = Navigation.findNavController(it)
              navController.navigate(R.id.action_resultFragment_to_menuActivity)
              activity?.finish()
          }else if (quiz == "quiz2"){
              navController = Navigation.findNavController(it)
              navController.navigate(R.id.action_resultFragment2_to_menuActivity)
              activity?.finish()
          }else if (quiz == "quiz3"){
              navController = Navigation.findNavController(it)
              navController.navigate(R.id.action_resultFragment3_to_menuActivity)
              activity?.finish()
          }else if (quiz == "quiz4"){
              navController = Navigation.findNavController(it)
              navController.navigate(R.id.action_resultFragment4_to_menuActivity)
              activity?.finish()
          }

        }

    }
}