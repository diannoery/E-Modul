package com.example.mediapembelajaran.ui.materi

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
import com.example.mediapembelajaran.ui.kidi.KiKdViewModel
import com.example.mediapembelajaran.ui.kidi.KikdRecycleView
import kotlinx.android.synthetic.main.fragment_ki_kd.*
import kotlinx.android.synthetic.main.fragment_materi.*
import kotlinx.android.synthetic.main.fragment_materi.materi_pdf
import kotlinx.android.synthetic.main.fragment_materi_tiga.*


class MateriTigaFragment : Fragment() {

    val ytViewModel by activityViewModels<YoutubeViewModel>()
    lateinit var ytRecycleView: YoutubeRecycleView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView40.text="   Pada tahap ini kamu diminta untuk  dapat memusatkan perhatian pada materi pembelajaran dengan membaca dan melihat gambar atau video."
        textView41.text="Teknik Pengolahan Makanan"
        textView42.text="   Makanan merupakan salah satu kebutuhan primer dari kehidupan manusia. Tanpa adanya makanan, manusia tidak mungkin bertahan hidup. Pada jaman dahulu manusia berburu untuk mempertahankan hidupnya. Mereka menikmati makanan dalam kondisi mentah. Seiring dengan kemajuan zaman, manusia mendapat hasrat untuk mendapat cita rasa yang lebih dari makanan yang disantapnya. Karena itulah, dalam pengolahan makanan, manusia melakukan banyak inovasi, seperti menemukan bumbu, bahan makanan yang baru, maupun cara pengolahannya."
        textView43.text="   Pengolahan makanan merupakan salah satu proses penerapan panas dari bahan mentah menjadi matang dengan cara yang sesuai untuk setiap bahan dasar dengan tujuan tertentu. Oleh karena itu, proses memasak hanya berlangsung selama panas mengenai bahan makanan. Untuk mengolah sebuah mengolah makanan sesuai dengan tujuannya, dikenal beberapa teknik mengolah makanan. Adapun teknik dasar pengolahan makanan dibedakan menjadi 2 yaitu, teknik pengolahan makanan panas basah (moist heat cooking) dan teknik pengolahan panas kering ( dry heat cooking ). \n" +
                "Perhatikan dan amati gambar pengolahan makanan berikut ini!\n"

        youtube_RV.layoutManager= LinearLayoutManager(activity)
        ytRecycleView = YoutubeRecycleView(ytViewModel.YoutubeLiveData.value!!)
        youtube_RV.adapter= ytRecycleView
        ytViewModel.YoutubeLiveData.observe(viewLifecycleOwner, Observer {
            ytRecycleView.notifyDataSetChanged()
        })


    }
}