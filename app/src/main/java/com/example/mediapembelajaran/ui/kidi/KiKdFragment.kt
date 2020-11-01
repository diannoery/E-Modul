package com.example.mediapembelajaran.ui.kidi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.example.mediapembelajaran.ui.materi.GalleryViewModel
import com.example.mediapembelajaran.ui.materi.MateriReceycleView
import kotlinx.android.synthetic.main.fragment_gallery.*
import kotlinx.android.synthetic.main.fragment_ki_kd.*

class KiKdFragment : Fragment() {
    val kikdViewModel by activityViewModels<KiKdViewModel>()
    lateinit var kikdRecycleView: KikdRecycleView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ki_kd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        kidi_data.layoutManager= LinearLayoutManager(activity, RecyclerView.HORIZONTAL,false)
        kikdRecycleView = KikdRecycleView(kikdViewModel.kikdLiveData.value!!)
        kidi_data.adapter= kikdRecycleView
        kikdViewModel.kikdLiveData.observe(viewLifecycleOwner, Observer {
            kikdRecycleView.notifyDataSetChanged()
        })
    }
}