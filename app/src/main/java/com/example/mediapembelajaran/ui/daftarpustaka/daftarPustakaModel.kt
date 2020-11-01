package com.example.mediapembelajaran.ui.daftarpustaka

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DaftarPustakaModel : ViewModel() {
    val listDaftar = mutableListOf<DaftarPustaka>(
        DaftarPustaka("Lubis, Cidartaty. 2013. Boga Dasar 1. Jakarta: Kemendikbud Direktorat Pembinaan Sekolah Kejuruan"),
        DaftarPustaka("Maulida, Wita. 2019. Boga Dasar. Malang: PT. Kuantum Buku Sejahtera"),
        DaftarPustaka(" Arkana Chest. “Simmering.” Youtube. Youtube, 23 April 2014. Web. 20 Oktober 2020."),
        DaftarPustaka(" ATCO Blue Flame Kitchen. “How to Shallow Fry Fish.” Youtube. Youtube, 25 Maret 2015. Web. 20 Oktober 2020."),
        DaftarPustaka(" Circulon Cookware. “How to Stew with Ease-Beginner Cooking Tips-Circulon.”Youtube. Youtube, 12 Desember 2011. Web. 20 Oktober 2020."),
        DaftarPustaka(" Cookingguide.”Cooking Tips : How to Deep Fry Chicken.” Youtube. Youtube, 28 Oktiber 2008. Web. 20 Oktober 2020."),
        DaftarPustaka("  Cookingguide.”How to Blanch Vegetables.” Youtube. Youtube, 4 Maret 2015. Web. 20 Oktober 2020."),
        DaftarPustaka("Cookingguide. ”How to Grill for Beginners : Grilling & Cooking.” Youtube. Youtube, 19 Mei 2014. Web. 20 Oktober 2020."),
        DaftarPustaka(" Cooking Channel. “Foolproof Poached Salmon-Cooking.” Youtube. Youtube, 22 Februari 2011. Web. 20 Oktober 2020."),
        DaftarPustaka("French Cooking Academy. “Family Home Style Roast Chicken (using the 3 stages roasting method.”. Youtube. Youtube, 21 Juli 2018. Web. 20 Oktober 2020."),
        DaftarPustaka("HandCNews. “CEDA 2013 Grand Prix Award – Best commercial kitchen design and installation.” Youtube. Youtube, 18 April 2013. Web. 20 Oktober 2020."),
        DaftarPustaka(" UCCCulinaryArts. “Sauteing.” Youtube. Youtube, 26 September 2011. Web. 20 Oktober 2020."),
        DaftarPustaka("Sikana English. “How to Steam chicken Cooking Chicken.”Youtube. Youtube, 30 Juni 2016. Web. 20 Oktober 2020."),
        DaftarPustaka("SKWAD Food, “Tips Memotong Bahan Makanan Yang Tepat Ala Chef Profesional!”. Youtube. Youtube, 2 April 2019. Web. 20 Oktober 2020."),
        DaftarPustaka("Tesco.”How to Braise | Tesco Food.”Youtube. Youtube, 19 Mei 2014. Web. 20 Oktober 2020."),
        DaftarPustaka(" The Cooking Foodie.”Chocolate Cupcakes Recipe | How to Make Chocolate Cupcakes.” Youtube. Youtube, 14 September 2019. Web. 20 Oktober 2020."),
        DaftarPustaka(" Zuan Ahli Dapur. “Telur Rebus Burung Puyuh.” Youtube. Youtube, 5 Oktober 2017. Web. 20 Oktober 2020."),

        )

     val daftarLiveData : MutableLiveData<MutableList<DaftarPustaka>> = MutableLiveData(listDaftar)
}


class DaftarPustaka(daftar: String) {
    val daftar = daftar
}