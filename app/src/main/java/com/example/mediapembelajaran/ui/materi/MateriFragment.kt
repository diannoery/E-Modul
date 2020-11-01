package com.example.mediapembelajaran.ui.materi

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.mediapembelajaran.R
import kotlinx.android.synthetic.main.fragment_materi.*


class MateriFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val materi = arguments?.getString("materi")
        val syntax = arguments?.getString("syntax")


        if (materi == "KegiatanBelajar"){
            MateriSatu(syntax,materi)
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 1"
        }else if(materi == "KegiatanBelajar2"){
            MateriDua(syntax,materi)
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 2"
        }else if(materi == "KegiatanBelajar3"){
            MateriTiga(syntax,materi)
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 3"
        }else if(materi == "KegiatanBelajar4-1"){
            MateriEmpat(syntax,materi)
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 4"
        }else if(materi == "KegiatanBelajar4-2"){
            MateriEmpat(syntax,materi)
            (activity as AppCompatActivity).supportActionBar?.title = "Materi 4"
        }


    }

    private fun MateriTiga(syntax: String?, materi: String) {
        SyntaxKegiatanBelajar(syntax,materi)
    }
    private fun MateriEmpat(syntax: String?, materi: String) {
        SyntaxKegiatanBelajar(syntax,materi)
    }
    private fun MateriSatu(syntax: String?, materi: String) {
        SyntaxKegiatanBelajar(syntax,materi)
    }

    private fun MateriDua(syntax: String?, materi: String) {
       SyntaxKegiatanBelajar(syntax,materi)
    }

    private fun SyntaxKegiatanBelajar(syntax: String?, materi: String) {
        if (syntax== "syntaxSatu"){
            materi_pdf.fromAsset("$materi.pdf")
                .pages(0,1)
                .load()
        }else if (syntax== "syntaxDua"){
          if (materi== "KegiatanBelajar2"){
              materi_pdf.fromAsset("$materi.pdf")
                  .pages(1,2)
                  .load()
          }else{
              materi_pdf.fromAsset("$materi.pdf")
                  .pages(2,3)
                  .load()
          }
        }else if (syntax == "syntaxTiga"){
            if (materi== "KegiatanBelajar2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(3)
                    .load()
            }else{
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(4)
                    .load()
            }

        }else if (syntax == "syntaxEmpat"){
            if (materi == "KegiatanBelajar2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(4,5,6,7,8)
                    .load()
            }else if(materi == "KegiatanBelajar3"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(5,6)
                    .load()
            }else if(materi == "KegiatanBelajar4-1"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(5,6)
                    .load()
            }else if(materi == "KegiatanBelajar4-2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(5)
                    .load()
            }else{
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(5,6,7,8,9)
                    .load()
            }
        }else if (syntax == "syntaxLima"){

            if (materi == "KegiatanBelajar2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(9)
                    .load()
            }else if(materi == "KegiatanBelajar3"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(8)
                    .load()
            }else if(materi == "KegiatanBelajar4-1"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(7)
                    .load()
            }else if(materi == "KegiatanBelajar4-2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(6)
                    .load()
            }else{
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(10)
                    .load()
            }

        }else if (syntax == "syntaxEnam"){
            if (materi == "KegiatanBelajar2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(10)
                    .load()
            }else if(materi == "KegiatanBelajar3"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(9)
                    .load()
            }else if(materi == "KegiatanBelajar4-1"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(8)
                    .load()
            }else if(materi == "KegiatanBelajar4-2"){
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(7)
                    .load()
            }else{
                materi_pdf.fromAsset("$materi.pdf")
                    .pages(11)
                    .load()
            }

        }
    }
}