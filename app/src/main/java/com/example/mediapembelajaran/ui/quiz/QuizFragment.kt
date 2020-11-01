package com.example.mediapembelajaran.ui.quiz

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mediapembelajaran.MenuActivity
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_quiz.*

class QuizFragment : Fragment() {

    companion object {
        fun newInstance() = QuizFragment()
    }
    lateinit var navController: NavController
    private lateinit var viewModel: QuizViewModel
    val mkViewModel by activityViewModels<QuizViewModel>()
    lateinit var mkRecycleView: QuizRecycleView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       // viewModel = ViewModelProviders.of(this).get(QuizViewModel::class.java)
        // TODO: Use the ViewModel
        quiz_Receycle_view.layoutManager = LinearLayoutManager(activity)
        mkRecycleView = QuizRecycleView(mkViewModel.MKLiveData.value!!)
        quiz_Receycle_view.adapter= mkRecycleView

        mkViewModel.MKLiveData.observe(viewLifecycleOwner, Observer {
            mkRecycleView.notifyDataSetChanged()
        })
    }

}