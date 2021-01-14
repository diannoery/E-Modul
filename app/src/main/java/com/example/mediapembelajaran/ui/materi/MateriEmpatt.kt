package com.example.mediapembelajaran.ui.materi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_materi_empatt.*


class MateriEmpatt : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi_empatt, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        (activity as AppCompatActivity).supportActionBar?.title = "Materi 4"

        materi4Awal.text="Pada tahap ini kamu diminta untuk dapat memusatkan perhatian pada materi pembelajaran dengan membaca dan melihat gambar berikut ini:"
        materi4Ke2.text="Bumbu dan Rempah"
        materi4Ke3.text="Indonesia merupakan negara kepulauan yang memiliki aneka ragam jenis dan bentuk masakan. Masakan khas Indonesia selalu identik dengan cita rasa yang kuat karena hampir seluruh masakannya kaya akan bumbu dapur yang berasal dari rempah-rempah. Sebuah masakan akan kurang sedap jika tidak ditambahkan bumbu atau rempah dalam masakan tersebut. Bumbu dan rempah merupakan penyedap makanan yang berbeda. Tahukah kamu bahwa terdapat perbedaan bumbu dan rempah? (jawaban ya atau tidak)"
        materi4Ke4.text="Perhatikan dan amati gambar berikut ini!"
        materi4Ke5.text="Berdasarkan gambar tersebut, menurut kamu gambar manakah yang merupakan jenis bumbu? ( pilihan jawaban a atau b)\n" +
                "Lalu, gambar yang mana merupakan rempah? (pilihan jawaban a atau b)\n"

        materi4Ke6.text="Jika kita mengamati gambar dengan teliti, akan terlihat adanya perbedaan antara bumbu dan rempah. Bumbu adalah tanaman aromatik yang ditambahkan pada masakan sebagai penyedap dan pembangkit selera makan. Bumbu memiliki karakteristik yang dapat\n" +
                " \n" +
                "menyebabkan tidak dapat bertahan lama dan mudah busuk. Bumbu dapat dibedakan sesuai kelompoknya yaitu, bumbu yang berasal dari buah, daun, batang, bunga, umbi, dan akar.\n" +
                "Sedangkan rempah merupakan bahan penyedap masakan yang dapat disimpan dan tahan lama. Sama seperti bumbu, rempah juga dapat dibedakan sesuai kelompoknya yaitu, rempah yang berasal dari batang, biji, bunga dan buah.\n" +
                "Selain bumbu dan rempah yang berasal dari tumbuhan, juga terdapat bumbu masakan yang berasal dari hewani.\n"






    }
}