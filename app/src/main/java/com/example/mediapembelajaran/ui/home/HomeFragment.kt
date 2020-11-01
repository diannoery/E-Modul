package com.example.mediapembelajaran.ui.home

import android.app.Dialog
import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mediapembelajaran.MenuActivity
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
//    var image = intArrayOf(R.drawable.wp1,R.drawable.wp2,R.drawable.wp3,R.drawable.wp4,)
//
//    var caption = arrayOf("wp1","wp2","wp3","wp4")
    private lateinit var homeViewModel: HomeViewModel
    lateinit var adabter : HomeRecycleView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.show()

        NetworkTask(this).execute()

//        carouselView.setImageListener { position, imageView ->
//            imageView.setImageResource(homeViewModel.image[position])
//        }
//        carouselView.pageCount= homeViewModel.caption.size
//
//        carouselView.setImageClickListener { position->
//            Toast.makeText(context, homeViewModel.caption[position], Toast.LENGTH_SHORT).show()
//        }
    }

    class NetworkTask(var activity : HomeFragment) : AsyncTask<Void,Void,Void>(){

        var dialog = activity.context?.let { Dialog(it, android.R.style.Theme_Translucent_NoTitleBar) }
        override fun onPreExecute() {
            val view= activity.layoutInflater.inflate(R.layout.full_loading,null)
            dialog?.setContentView(view)
            dialog?.setCancelable(false)
            dialog?.show()
            super.onPreExecute()
        }

        override fun doInBackground(vararg p0: Void?): Void? {
            Thread.sleep(2000)
            return null
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            dialog?.dismiss()
        }

    }
}