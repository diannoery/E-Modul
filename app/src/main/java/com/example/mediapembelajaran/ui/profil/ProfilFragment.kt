package com.example.mediapembelajaran.ui.profil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_profil.*

class ProfilFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profil.text =
                    " Lulu Fajarwati lahir di Medan 28  Juni 1994. Jenjang pendidikannya dimulai dari SD Swasta Al-Azhar Medan, SMP Swasta Harapan Mandiri Medan, SMA Swasta Harapan Mandiri Medan. Kemudian meneruskan ke jenjang perguruan tinggi di Universitas Negeri Medan mengambil program studi Pend. Tata Boga dan sekarang melanjutkan studi di Program Pascasarjana Pendidikan Teknologi dan Kejuruan di Universitas Negeri Padang.\n" +
                    "\n" +
                    "Modul Boga Dasar ini merupakan produk yang dibuat sebagai bagian dari tugas akhir (tesis) untuk memperoleh gelar Magister. Pengembang berusaha menyajikan modul ini sebaik mungkin agar bermanfaat bagi siswa SMK jurusan tata boga.\n" +
                    "\n" +
                    "Semoga modul ini bermanfaat dan dapat digunakan dalam proses pembelajaran di sekolah maupun di luar lingkungan sekolah.\n"
    }
}