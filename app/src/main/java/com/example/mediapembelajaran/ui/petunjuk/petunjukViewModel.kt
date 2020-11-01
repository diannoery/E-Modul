package com.example.mediapembelajaran.ui.petunjuk

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mediapembelajaran.ui.quiz.Kuis
import com.example.mediapembelajaran.ui.quiz.MataPelajaran

class PetunjukViewModel : ViewModel() {
    val listPetnjuk = mutableListOf<Petunjuk>(
        Petunjuk(
            "Langkah 1",
            "Belajar menggunakan modul ini dapat dilakukan dimana pun dan kapan pun"
        ),
        Petunjuk(
            "Langkah 2",
            "Cermati baik-baik kompetensi, indikator, dan tujuan pembelajaran dari masing-masing materi pembelajaran."
        ),
        Petunjuk(
            "Langkah 3",
            "Kegiatan pembelajaran pada modul ini berbasis discovery learning dimana setiap materi pelajaran terdiri dari 6 sintak yang harus adik-adik pahami dengan baik setiap kegiatan pembelajarannya."
        ), Petunjuk(
            "Langkah 4",
            "Setiap kegiatan pembelajaran dikerjakan berurutan sesuai dengan sintak yang ada. Jika menemukan kesulitan, kalian dapat mendiskusikannya bersama-sama dan apabila belum terpecahkan sebaiknya tanyakan pada guru."
        ), Petunjuk(
            "Langkah 5",
            "Mencari informasi dari buku maupun sumber lain sangat dianjurkan bagi kalian untuk mengikuti setiap kegiatan pembelajaran dalam modul ini."
        ), Petunjuk(
            "Langkah 6",
            "Setelah adik-adik memahami materi dan melakukan semua kegiatan pembelajaran, kerjakanlah evaluasi/latihan soal yang ada dalam e-modul secara mandiri untuk mengevaluasi keberhasilan belajar. Standar penilaian setiap tes adalah 80. Selamat mengerjakan!"
        ),


        )

    val PetunjukLiveData: MutableLiveData<MutableList<Petunjuk>> = MutableLiveData(listPetnjuk)


}

class Petunjuk(langkah: String, isi: String) {
    val langkah = langkah
    val isi = isi
}