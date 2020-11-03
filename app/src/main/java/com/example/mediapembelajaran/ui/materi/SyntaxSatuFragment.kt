package com.example.mediapembelajaran.ui.materi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mediapembelajaran.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import kotlinx.android.synthetic.main.fragment_syntax_satu.*


class SyntaxSatuFragment : Fragment() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_syntax_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        pdfview.fromAsset("KegiatanBelajar.pdf")
//            .pages(2 ,3,4,5,6,7,8,9,10,11,12)
//            .load()
        // get reference to textview
        val materi = arguments?.getString("materi")
        println(materi)

        if (materi == "Peralatan Pengolahan Makanan"){
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 1"
            MateriSatu(view)
        }else if (materi == "Potongan Bahan Makananan"){
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 2"
            MateriDua(view)
        }else if (materi == "Teknik Pengolahan Makanan"){
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 3"
            MateriTiga(view)
        }

    }

    private fun MateriSatu(view: View) {
        textView29.text="Pada tahap ini kamu diminta untuk  dapat memusatkan perhatian pada materi pembelajaran dengan membaca dan melihat gambar atau video."
        textView31.text="Peralatan Pengolahan Makanan"
        textView17.text="Apakah sebelumnya kamu sudah pernah melihat dan mengetahui area kerja dalam industri boga? "
        textView33.text =
            "     Sebuah hotel yang memiliki fasilitas unggulan pasti memiliki dapur yang memadai. Peralatan dapur di hotel masa kini harus diperhatikan dan tidak boleh sembarangan. Hotel yang memiliki fasilitas bagus tentunya menyediakan perlengkapan dapur yang memilki kualitas tinggi. Peralatan dapur yang ada pada hotel tentunya berbeda dengan peralatan yang ada pada dapur rumah. Pada umumnya peralatan yang ada di dapur hotel lebih besar serta menggunakan teknologi yang lebih canggih."
        textView34.text =
            "     Dapur hotel merupakan salah satu bagian penting dari sebuah hotel, dimana tugas utamanya yaitu mengolah makanan dan minuman. Keberadaan dapur sangat menentukan sumber penghasilan hotel dari penjualan makanan dan minuman yang khusus disediakan untuk para tamu. Sehingga peralatan yang disediakan di dapur hotel harus memiliki standar kualitas tinggi."
        textView36.text =
            "     Video yang kamu amati sebelumnya merupakan sebagian kecil dari banyaknya peralatan yang ada pada area kerja industri boga. Area kerja dalam industri boga dilengkapi dengan kitchen equipment atau peralatan dapur. Kitchen Equipment merupakan segala peralatan dalam keadaan besar dan kecil yang digunakan dalam proses pengolahan makanan (food production). Pada umumnya dapur hotel berisi peralatan yang lebih canggih, besar, serta terstruktur secara rapi. Peralatan di dapur hotel tersebut merupakan peralatan pengolahan makanan. Peralatan pengolahan makanan tersebut merupakan benda yang terjaga mutu dan kebersihannya untuk memperlancar dalam pengolahan makanan yang dilakukan di dapur dan digunakan untuk memproses suatu bahan makanan menjadi makanan yang dapat dikonsumsi. "
        textView38.text="     Adapula penggolongan atau klasifikasi dari peralatan pengolahan makanan dapat dibedakan menjadi 4 klasifikasi diantaranya sebagai berikut: "
        textView39.text =
            "1.\tKlasifikasi berdasarkan menurut ukuran : Large Equipments & Kitchen Utensils\n" +
                    "2.\tKlasifikasi berdasarkan fungsi : Peralatan Persiapan Makanan (Preparation Equipment), Peralatan Pengolahan Makanan (Processing Equipment), Peralatan Penyajian Makanan (Platting Equipment), dan Peralatan menyiapkan makanan yang sudah diproses tetapi belum disajikan kepada tamu (Holding Equipment)\n" +
                    "3.\tKlasifikasi berdasarkan bahan dasar : Baja, stainless steel, alumunium, dan tembaga, kayu, plastik/melamin/karet\n" +
                    "4.\tKlasifikasi berdasarkan sumber energi : Peralatan listrik dan gas, non-listrik\n"
        val youTubePlayerView: YouTubePlayerView = view.findViewById(R.id.youtube_view)
        lifecycle.addObserver(youTubePlayerView)
        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = "cjKaBNiPGAs"
                youTubePlayer.cueVideo(videoId, 0f)
            }
        })
    }

    private fun MateriDua(view: View) {
        val videoId = "y2eNUbO6xvo"
        textView29.text="Pada tahap ini kamu diminta untuk  dapat memusatkan perhatian pada materi pembelajaran dengan membaca dan melihat gambar atau video."
        textView31.text="Potongan Bahan Makanan"
        textView17.text="     Tahukah kamu bahwa dalam memotong bahan makanan tidak boleh sembarangan dan asal-asalan?  "
        textView33.text="     Sebelum melakukan pengolahan makanan, terdapat langkah yang harus dilakukan terlebih dahulu, salah satunya memotong bahan makanan. Bahan makanan yang membutuhkan pemotongan sebelum proses pengolahan yaitu daging, unggas, ikan, sayuran, dan buah-buahan. Pemotongan bahan makanan dilakukan bukan tanpa alasan, memotong bahan makanan secara seragam berguna untuk membuat bahan makanan mencapai tingkat kematangan sempurna saat dimasak. Selain itu, potongan bahan makanan akan mempermudah proses pengolahan, mempercantik hidangan, dan menambah selera makan."
        textView34.text="     Tahukah kamu bahwa terdapat beraneka macam nama dan jenis dari potongan bahan makanan? "
       textView36.visibility =View.GONE
        last_card.visibility = View.GONE
        val youTubePlayerView: YouTubePlayerView = view.findViewById(R.id.youtube_view)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {

                youTubePlayer.cueVideo(videoId, 0f)
            }
        })
    }

    private fun MateriTiga(view: View) {
        val videoId = "y2eNUbO6xvo"
        textView29.text="Pada tahap ini kamu diminta untuk  dapat memusatkan perhatian pada materi pembelajaran dengan membaca dan melihat gambar atau video."
        textView31.text="Potongan Bahan Makanan"
        textView17.text="     Tahukah kamu bahwa dalam memotong bahan makanan tidak boleh sembarangan dan asal-asalan?  "
        textView33.text="     Sebelum melakukan pengolahan makanan, terdapat langkah yang harus dilakukan terlebih dahulu, salah satunya memotong bahan makanan. Bahan makanan yang membutuhkan pemotongan sebelum proses pengolahan yaitu daging, unggas, ikan, sayuran, dan buah-buahan. Pemotongan bahan makanan dilakukan bukan tanpa alasan, memotong bahan makanan secara seragam berguna untuk membuat bahan makanan mencapai tingkat kematangan sempurna saat dimasak. Selain itu, potongan bahan makanan akan mempermudah proses pengolahan, mempercantik hidangan, dan menambah selera makan."
        textView34.text="     Tahukah kamu bahwa terdapat beraneka macam nama dan jenis dari potongan bahan makanan? "
        val youTubePlayerView: YouTubePlayerView = view.findViewById(R.id.youtube_view)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {

                youTubePlayer.cueVideo(videoId, 0f)
            }
        })
    }
}