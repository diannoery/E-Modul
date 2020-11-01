package com.example.mediapembelajaran.ui.materi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mediapembelajaran.R
import com.example.mediapembelajaran.ui.petunjuk.PetunjukRecycleView
import kotlinx.android.synthetic.main.fragment_gallery.*
import kotlinx.android.synthetic.main.fragment_petunjuk.*

class GalleryFragment : Fragment() {

    private var materiDropDown = false
    lateinit var navController: NavController
    val materi1 = arrayOf("Petunjuk Kegiatan Belajar", "Sintak 1", "Evaluasi Materi")
    val materiDataViewModel by activityViewModels<GalleryViewModel>()
    lateinit var materiRecycleView: MateriReceycleView
     var syntax= false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_gallery, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val materisatu = arrayOf(
            "Peralatan Pengolahan Makanan",
            "Syntax 1",
            "Syntax 2",
            "Syntax 3",
            "Syntax 4",
            "Syntax 5",
            "Syntax 6"
        )
        val materidua = arrayOf(
            "Potongan Bahan Makananan",
            "Syntax 1",
            "Syntax 2",
            "Syntax 3",
            "Syntax 4",
            "Syntax 5",
            "Syntax 6"
        )
        val materitiga = arrayOf(
            "Teknik Pengolahan Makanan",
            "Syntax 1",
            "Syntax 2",
            "Syntax 3",
            "Syntax 4",
            "Syntax 5",
            "Syntax 6"
        )
        val materiempat = arrayOf(
            "Bumbu dan Rempah",
            "Syntax 1",
            "Syntax 2",
            "Syntax 3",
            "Syntax 4",
            "Syntax 5",
            "Syntax 6"
        )
        val materiempatdua = arrayOf(
            "Bumbu Dasar Pada Masakan Indonesia",
            "Syntax 1",
            "Syntax 2",
            "Syntax 3",
            "Syntax 4",
            "Syntax 5",
            "Syntax 6"
        )
        val materisatuAdapter =
            activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, materisatu) }
        val materiDuaAdapter =
            activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, materidua) }
        val materiTigaAdapter =
            activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, materitiga) }
        val materiEmpatAdapter =
            activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, materiempat) }
        val materiEmpatDuaAdapter =
            activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, materiempatdua) }


        spinner.adapter = materisatuAdapter
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                when (materisatu[p2]) {
                    "Syntax 1" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_syntaxSatuFragment,
                            bundleOf("materi" to "Peralatan Pengolahan Makanan")
                        )
                        spinner.setSelection(0)
                    }
                    "Syntax 2" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar","syntax" to "syntaxDua" )
                        )
                        spinner.setSelection(0)
                    }
                    "Syntax 3" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar","syntax" to "syntaxTiga" )
                        )
                        spinner.setSelection(0)
                    }
                    "Syntax 4" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar","syntax" to "syntaxEmpat" )
                        )
                        spinner.setSelection(0)
                    }
                    "Syntax 5" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar","syntax" to "syntaxLima" )
                        )
                        spinner.setSelection(0)
                    }
                    "Syntax 6" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar","syntax" to "syntaxEnam" )
                        )
                        spinner.setSelection(0)
                    }
                    else->{}
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        spinner2.adapter= materiDuaAdapter
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (materidua[p2]) {
                    "Syntax 1" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_syntaxSatuFragment,
                            bundleOf("materi" to "Potongan Bahan Makananan")
                        )
                        spinner2.setSelection(0)
                    }
                    "Syntax 2" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar2","syntax" to "syntaxDua" )
                        )
                        spinner2.setSelection(0)
                    }
                    "Syntax 3" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar2","syntax" to "syntaxTiga" )
                        )
                        spinner2.setSelection(0)
                    }
                    "Syntax 4" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar2","syntax" to "syntaxEmpat" )
                        )
                        spinner2.setSelection(0)
                    }
                    "Syntax 5" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar2","syntax" to "syntaxLima" )
                        )
                        spinner2.setSelection(0)
                    }
                    "Syntax 6" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar2","syntax" to "syntaxEnam" )
                        )
                        spinner2.setSelection(0)
                    }
                    else->{}
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        spinner3.adapter= materiTigaAdapter
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (materitiga[p2]) {
                    "Syntax 1" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiTigaFragment,
                            bundleOf("materi" to "Teknik Pengolahan Makanan")
                        )
                        spinner3.setSelection(0)
                    }
                    "Syntax 2" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar3","syntax" to "syntaxDua" )
                        )
                        spinner3.setSelection(0)
                    }
                    "Syntax 3" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar3","syntax" to "syntaxTiga" )
                        )
                        spinner3.setSelection(0)
                    }
                    "Syntax 4" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar3","syntax" to "syntaxEmpat" )
                        )
                        spinner3.setSelection(0)
                    }
                    "Syntax 5" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar3","syntax" to "syntaxLima" )
                        )
                        spinner3.setSelection(0)
                    }
                    "Syntax 6" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar3","syntax" to "syntaxEnam" )
                        )
                        spinner3.setSelection(0)
                    }
                    else->{}
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        spinner4.adapter= materiEmpatAdapter
        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (materiempat[p2]) {
                    "Syntax 1" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxSatu" )
                        )
                        spinner4.setSelection(0)
                    }
                    "Syntax 2" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxDua" )
                        )
                        spinner4.setSelection(0)
                    }
                    "Syntax 3" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxTiga" )
                        )
                        spinner4.setSelection(0)
                    }
                    "Syntax 4" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxEmpat" )
                        )
                        spinner4.setSelection(0)
                    }
                    "Syntax 5" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxLima" )
                        )
                        spinner4.setSelection(0)
                    }
                    "Syntax 6" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxEnam" )
                        )
                        spinner4.setSelection(0)
                    }
                    else->{}
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        spinner5.adapter= materiEmpatDuaAdapter
        spinner5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (materiempatdua[p2]) {
                    "Syntax 1" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiEmpatFragment,
                            bundleOf("materi" to "KegiatanBelajar4-1","syntax" to "syntaxSatu" )
                        )
                        spinner5.setSelection(0)
                    }
                    "Syntax 2" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-2","syntax" to "syntaxDua" )
                        )
                        spinner5.setSelection(0)
                    }
                    "Syntax 3" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-2","syntax" to "syntaxTiga" )
                        )
                        spinner5.setSelection(0)
                    }
                    "Syntax 4" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-2","syntax" to "syntaxEmpat" )
                        )
                        spinner5.setSelection(0)
                    }
                    "Syntax 5" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-2","syntax" to "syntaxLima" )
                        )
                        spinner5.setSelection(0)
                    }
                    "Syntax 6" -> {
                        navController = p1?.let { Navigation.findNavController(it) }!!
                        navController.navigate(
                            R.id.action_nav_gallery_to_materiFragment,
                            bundleOf("materi" to "KegiatanBelajar4-2","syntax" to "syntaxEnam" )
                        )
                        spinner5.setSelection(0)
                    }
                    else->{}
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


    }
}