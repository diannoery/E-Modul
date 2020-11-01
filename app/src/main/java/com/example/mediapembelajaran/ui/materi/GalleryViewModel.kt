package com.example.mediapembelajaran.ui.materi

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mediapembelajaran.R

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text
    val materi = mutableListOf<MateriList>(
        MateriList(
            "Peralatan Pengelolahan Makanan",
            "     Sebuah hotel yang memiliki fasilitas unggulan pasti memiliki dapur yang memadai. Peralatan dapur di hotel masa kini harus diperhatikan dan tidak boleh sembarangan. Hotel yang memiliki fasilitas bagus tentunya menyediakan perlengkapan dapur yang memilki kualitas tinggi. Peralatan dapur yang ada pada hotel tentunya berbeda dengan peralatan yang ada pada dapur rumah. Pada umumnya peralatan yang ada di dapur hotel lebih besar serta menggunakan teknologi yang lebih canggih.",
            "     Dapur hotel merupakan salah satu bagian penting dari sebuah hotel, dimana tugas utamanya yaitu mengolah makanan dan minuman. Keberadaan dapur sangat menentukan sumber penghasilan hotel dari penjualan makanan dan minuman yang khusus disediakan untuk para tamu. Sehingga peralatan yang disediakan di dapur hotel harus memiliki standar kualitas tinggi.",
            "     Video yang kamu amati sebelumnya merupakan sebagian kecil dari banyaknya peralatan yang ada pada area kerja industri boga. Area kerja dalam industri boga dilengkapi dengan kitchen equipment atau peralatan dapur. Kitchen Equipment merupakan segala peralatan dalam keadaan besar dan kecil yang digunakan dalam proses pengolahan makanan (food production). Pada umumnya dapur hotel berisi peralatan yang lebih canggih, besar, serta terstruktur secara rapi. Peralatan di dapur hotel tersebut merupakan peralatan pengolahan makanan. Peralatan pengolahan makanan tersebut merupakan benda yang terjaga mutu dan kebersihannya untuk memperlancar dalam pengolahan makanan yang dilakukan di dapur dan digunakan untuk memproses suatu bahan makanan menjadi makanan yang dapat dikonsumsi. ",
            "1.\tKlasifikasi berdasarkan menurut ukuran : Large Equipments & Kitchen Utensils\n" +
                    "2.\tKlasifikasi berdasarkan fungsi : Peralatan Persiapan Makanan (Preparation Equipment), Peralatan Pengolahan Makanan (Processing Equipment), Peralatan Penyajian Makanan (Platting Equipment), dan Peralatan menyiapkan makanan yang sudah diproses tetapi belum disajikan kepada tamu (Holding Equipment)\n" +
                    "3.\tKlasifikasi berdasarkan bahan dasar : Baja, stainless steel, alumunium, dan tembaga, kayu, plastik/melamin/karet\n" +
                    "4.\tKlasifikasi berdasarkan sumber energi : Peralatan listrik dan gas, non-listrik\n"

        ),
//        MateriList("Potongan Bahan Makananan"),
//        MateriList("Teknik Pengolahan Makanan"),
//        MateriList("Bumbu Dasar dan Turunannya Pada Masakan Indonesia")
    )
    val materiLiveData: MutableLiveData<MutableList<MateriList>> = MutableLiveData(materi)

}

class MateriList(var materi: String, ki: String, kd: String, indikator: String, tujuan: String) {
    val materi_list = materi
    val ki_list = ki
    val kd_list = kd
    val indikator_list = indikator
    val tujuan_list = tujuan


}