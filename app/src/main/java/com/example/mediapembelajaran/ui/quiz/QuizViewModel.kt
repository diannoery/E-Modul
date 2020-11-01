package com.example.mediapembelajaran.ui.quiz

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {
    val MKList = mutableListOf<MataPelajaran>(
        MataPelajaran("Peralatan Pengelolahan Makanan"),
        MataPelajaran("Potongan Bahan Makananan"),
        MataPelajaran("Teknik Pengolahan Makanan"),
        MataPelajaran("Bumbu Dasar dan Turunannya Pada Masakan Indonesia")
    )

    val MKLiveData: MutableLiveData<MutableList<MataPelajaran>> = MutableLiveData(MKList)


    val kuisMateriSatu = mutableListOf<Kuis>(
        Kuis(
            "Segala peralatan dalam keadaan besar dan kecil yang digunakan dalam proses pengolahan makanan (food production) adalah...",
            "Kitchen equipment",
            "Large equipment",
            "Utensil",
            "Equipment",
            "Mechanic equipment",
            "Kitchen equipment"
        ),
        Kuis(
            "Fungsi peralatan yang tepat adalah sebagai berikut….",
            "Kitchen equipments, utensils equipments, processing equipments",
            "Preparation equipments, processing equipments, platting equipments",
            "Utensils equipments, processing equipments, platting equipments",
            "Preparation equipments, processing equipments, kitchen equipments",
            "Preparation chasis, processing build, design interior",
            "Preparation equipments, processing equipments, platting equipments"
        ),
        Kuis(
            "Peralatan besar yang tidak dapat/sulit dipindahkan yaitu...",
            "Kitchen equipment",
            "Large equipment",
            "Utensil",
            "Equipment",
            "Mechanic equipment", "Large equipment"
        ),
        Kuis(
            "Peralatan yang mudah dipindahkan adalah pengertian dari... ",
            "Kitchen equipment",
            "Large equipment",
            "Kitchen utensil",
            "Equipment",
            "Mechanic equipment",
            "Kitchen utensil"

        ),
        Kuis(
            "Peralatan untuk persiapan pengolahan disebut adalah….",
            "Kitchen equipment",
            "Preparation Equipments",
            "Service/platting equipment",
            "Processing equipment",
            "Holding equipment",
            "Preparation Equipments"
        ),


        Kuis(
            "Peralatan untuk pengolahan yaitu....",
            "Preparation Equipments",
            "Service/platting equipment",
            "Processing equipment",
            "Kitchen equipment",
            "Holding equipment",
            "Processing equipment"
        ),

        Kuis(
            "Peralatan untuk penyajian disebut juga….",
            "Preparation Equipments",
            "Processing equipment",
            "Service/platting equipment",
            "Kitchen equipment",
            "Holding equipment",
            "Service/platting equipment"
        ),

        Kuis(
            "Dough mixer, meat grinder, meat slicer, food blender, bread slicer termasuk ke dalam....",
            "Service/platting equipment",
            "Preparation Equipments",
            "Processing equipment",
            "Kitchen equipment",
            "Holding equipment",
            "Processing equipment"
        ),

        Kuis(
            "Cooking range, oven, Stock pot, frying pan, knifes bagian dari….",
            "Preparation Equipments",
            "Processing equipment",
            "Service/platting equipment",
            "Kitchen equipment",
            "Holding equipment",
            "Processing equipment"
        ),

        Kuis(
            "Kitchen platter, sizzling plater, casserole termasuk ke dalam…",
            "Service/platting equipment",
            "Preparation Equipments",
            "Processing equipment",
            "Kitchen equipment",
            "Holding equipment",
            "Service/platting equipment"
        ),


        Kuis(
            "Peralatan yang menggunakan bahan dasar stainless steel seperti.... ",
            "ladle, pot, skimmer, bowl",
            "plastic spatula, rolling pin, mortar",
            "frying pan dan sauce pan klasik",
            "cetakan cendol",
            "chopping board, wooden spatula",
            "ladle, pot, skimmer, bowl"
        ),


        Kuis(
            "Gambar berikut ini merupakan….",
            "Meat Slicer",
            "Meat Grinder",
            "Bread Slicer",
            "Food Blender",
            "Dough Mixer",
            "Meat Grinder"
        ),

        Kuis(
            "Peralatan yang menggunakan bahan dasar copper (tembaga) seperti....",
            "ladle, pot, skimmer, bowl",
            "spatula, rolling pin, mortar, chopping board",
            "sauce pan besar dan kecil",
            "frying pan dan sauce pan klasik",
            "chopping board, wooden spatula",
            "frying pan dan sauce pan klasik"
        ),

        Kuis(
            "Alat yang dipakai untuk menyiapkan makanan yang sudah diproses tetapi belum disajikan kepada tamu merupakan pengertian dari...",
            "Kitchen equipment",
            "Large equipment",
            "Utensil",
            "Holding Equipment",
            "Mechanic equipment",
            "Holding Equipment"
        ),

        Kuis(
            "Alat dipakai untuk menyimpan makanan panas, seperti: bain marie, hot table, warmer, infra red warmer adalah....",
            "Cold Holding Equipments",
            "Hot Holding Equipments",
            "Warm Holding Equipments",
            "Frezze Holding Equipments",
            "Hot and cold holding Equipments",
            "Hot Holding Equipments"
        ),

        Kuis(
            "Alat ini digunakan untuk menyimpan makan daging, seperti: refrigerator, cooler, cold rack (container plastic) yang digunakan untuk menyimpan es, cold food, beverage, dan keperluan catering yang digunakan hotel-hotel besar pada umumnya....",
            "Cold Holding Equipments",
            "Frezze Holding Equipments",
            "Hot Holding Equipments",
            "Warm Holding Equipments",
            "Hot and Cold Holding Equipments",
            "Cold Holding Equipments"
        ),


        Kuis(
            "Gambar berikut ini merupakan….",

            "Knives",
            "Utensils",
            "Cooking Range",
            "Pot dan Pan",
            "Spatula",
            "Utensils"
        ),

        Kuis(
            "Peralatan yang menggunakan bahan dasar kayu adalah....",
            "ladle, pot, skimmer, bowl",
            "spatula, rolling pin, mortar, chopping board",
            "sauce pan besar dan kecil",
            "frying pan dan sauce pan klasik",
            "chopping board, wooden spatula",
            "spatula, rolling pin, mortar, chopping board"
        ),


        Kuis(
            "Platter berbentuk oval untuk menyajikan steak adalah….",
            "Sizzling Platter",
            "Caserol dish",
            "Kitchen platter",
            "Bowl",
            "Sole dish",
            "Sizzling Platter"
        ),

        Kuis(
            "Siswa yang sedang melaksanakan praktik memasak ditugaskan untuk mencuci peralatan yang berasal dari kayu. Cara membersihkan peralatan dari kayu adalah, kecuali….",
            "Tidak dicuci dengan air",
            "Menggunakan sikat",
            "Dikeringkan sebelum disimpan",
            "Menggunakan air panas",
            "Direndam air cuka",
            "Direndam air cuka"
        ),
    )
    val KuisMateriDua = mutableListOf<Kuis>(
        Kuis(
            "Potongan bahan makanan dilakukan untuk mempersiapkan proses pengolahan makanan ataupun hanya sebagai garnis pada hidangan merupakan pengertian dari….",
            "Pengolahan bahan makanan",
            "Penyimpanan bahan makanan",
            "Potongan bahan makanan",
            "Pemilihan bahan makanan",
            "Pengenalan bahan makanan",
            "Potongan bahan makanan"
        ),


        Kuis(
            "Sebelum diolah, bahan makanan dipotong terlebih dahulu. Hal ini dimaksudkan sebagai berikut, kecuali….",
            "Menambah nilai estetika pada makanan",
            "Menambah selera makan",
            "Mempermudah proses pengolahan bahan makanan",
            "Sesuai dengan hidangan yang akan dibuat",
            "Mengurangi nilai gizi suatu bahan makanan",
            "Mempermudah proses pengolahan bahan makanan"
        ),

        Kuis(
            "Yang harus diperhatikan sebelum melakukan pemotongan bahan makanan, kecuali….",
            "Mencuci bahan makanan",
            "Penyimpanan bahan makanan",
            "Mengupas bahan makanan",
            "Harga bahan makanan",
            "Kelayakan bahan makanan",
            "Harga bahan makanan"
        ),


        Kuis(
            "Irisan sayuran yang halus pada kol atau lettuce disebut….",
            "Dice",
            "Brunoise",
            "Macedoine",
            "Jardinière",
            "Chiffonade",
            "Chiffonade"
        ),


        Kuis(
            "Potongan sayuran secara chop tetapi lebih kasar disebut….",
            "Chopped",
            "Cube",
            "Allumettes",
            "Jullienne",
            "Concasser",
            "Concasser"
        ),


        Kuis(
            "Bentuk potongan sayuran dengan ukuran 1cm x 1cm x 1cm adalah….",
            "Jullienne",
            "Brunoise",
            "Macedoine",
            "Jardinière",
            "Paysanne",
            "Macedoine"
        ),


        Kuis(
            "Potongan sayuran berbentuk segi lima gentong adalah….",
            "Chateaw style",
            "Turning",
            "Williamse",
            "Brunoise",
            "Barney",
            "Turning"
        ),


        Kuis(
            "Gambar berikut merupakan potongan berbentuk….",
            "Brunoise",
            "Macedoine",
            "Chopped",
            "Paysanne",
            "Jardinière",
            "Chopped"
        ),


        Kuis(
            "Ikatan bumbu yang terdiri dari batang sledri, lada butir, bay leaf, thyme, bawang pre merupakan….",
            "Mire poix",
            "Bouquet garni",
            "Macedoine",
            "Pommes frites",
            "Pommes allumates",
            "Bouquet garni"
        ),

        Kuis(
            "Potongan sayuran berbentuk batang korek api merupakan jenis potongan….",
            "Barrel",
            "Julienne",
            "Jardinière",
            "Cube",
            "Vichy carrot",
            "Julienne"
        ),


        Kuis(
            "Gambar berikut merupakan jenis potongan….",
            "Paysanne",
            "Vichy carrot",
            "Allumette",
            "Macedoine",
            "Turning ",
            "Paysanne"
        ),

        Kuis(
            "Potongan ini biasanya digunakan sebagai bumbu kaldu/stock adalah….",
            "Turning",
            "Barrel",
            "Mirepoix",
            "Brunoise",
            "Allumette",
            "Mirepoix"
        ),


        Kuis(
            "Pelengkap garnish, underliner pada salad dan shrimp cocktail adalah….",
            "Dice",
            "Chiffonade",
            "Macedoine",
            "Jardinière",
            "Brunoise",
            "Chiffonade"
        ),

        Kuis(
            "Potongan kentang berbentuk kelereng kecil yang dibentuk menggunakan mould….",
            "Pommes chips",
            "Pommes cocotte",
            "Nut potatoes",
            "Potatoes wedges",
            "Pommes parmentiere",
            "Nut potatoes"
        ),


        Kuis(
            "Bentuk potongan kentang berikut adalah….",
            "Potatoes waffle",
            "Potatotes chips",
            "Pommes cocotte",
            "Pommes anna",
            "Pommes sain",
            "Potatotes chips"
        ),


        Kuis(
            "Jika anda akan membuat pastel/risol/kroket dengan isian wortel, sebaiknya dipotong dengan bentuk….",
            "Turning",
            "Barrel",
            "Mirepoix",
            "Brunoise",
            "Alumette ",
            "Brunoise"
        ),

        Kuis(
            "Fillet ikan utuh panjang, kemudian disimpul menjadi bulatan atau lipatan disebut potongan….",
            "Delice",
            "Paupiette",
            "Goujon",
            "Troncom",
            "Supreme",
            "Delice"
        ),

        Kuis(
            "Dibawah ini merupakan bagian potongan daging sapi, kecuali….",
            "T-bone",
            "Chuck",
            "Rump",
            "Strip",
            "Darne",
            "Darne"
        ),


        Kuis(
            "Tenderloin adalah….",
            "Pemotongan daging sapi yang diperoleh dari bagian iga",
            "Pemotongan daging sapi yang berasal dari otot utama sekitar pinggang sapi",
            "Pemotongan daging sapi yang diambil dari bagian atasnya paha depan",
            "Pemotongan daging sapi yang diambil dari sekitar tulang iga/tulang rusuk sapi",
            "Potongan daging sapi yang berasal dari daerah punggung bagian belakang",
            "Pemotongan daging sapi yang berasal dari otot utama sekitar pinggang sapi"
        ),


        Kuis(
            "Potongan ikan yang dipotong bulat utuh adalah….",
            "Fillet",
            "Troncom",
            "Delice",
            "Paupiette",
            "Darne",
            "Troncom"
        )


    )
    val KuisMateriTiga = mutableListOf<Kuis>(

        Kuis(
            "Berikut ini merupakan fungsi dari pengolahan makanan, kecuali….",
            "Meningkatkan rasa",
            "Mempermudah pencernaan",
            "Memperbaiki tekstur",
            "Meningkatkan bakteri",
            "Meningkatkan penampilan",
            "Meningkatkan bakteri"
        ),
        Kuis(
            "Terdapat dua metode dalam teknik pengolahan makanan, yaitu….",
            "Boiling dan Braising",
            "Boiling dan Shallow Frying",
            "Moist Heat Cooking dan Dry Heat Cooking",
            "Moist Heat Cooking dan Shallow Frying",
            "Deep Frying dan Shallow Frying",
            "Moist Heat Cooking dan Dry Heat Cooking"
        ),


        Kuis(
            "Teknik memasak dengan menggunakan sedikit cairan disebut….",
            "Braising",
            "Boling",
            "Deep frying",
            "Simmering",
            "Steaming",
            "Braising"
        ),

        Kuis(
            "Pengolahan makanan dengan cairan mendidih bersuhu 100oC merupakan teknik….",
            "Braising",
            "Boiling",
            "Sautee",
            "Simmering",
            "Stewing",
            "Boiling"
        ),

        Kuis(
            "Dalam membuat kaldu, teknik pengolahan yang dipakai adalah….",
            "Baking",
            "Boiling",
            "Shallow frying",
            "Simmering",
            "Steaming ",
            "Simmering"
        ),


        Kuis(
            "Mengolah bahan makanan yang terlebih dahulu ditumis bumbunya, dan direbus dengan cairan yang berbumbu dengan api sedang disebut teknik….",
            "Boiling",
            "Simmering",
            "Stewing",
            "Grilling",
            "Roasting",
            "Stewing"
        ),


        Kuis(
            "Yang termasuk dari metode memasak panas kering adalah….",
            "Boiling",
            "Poaching",
            "Grilling",
            "Stewing",
            "Simmering",
            "Grilling"
        ),


        Kuis(
            "Dibawah ini yang termasuk metode memasak panas basah adalah….",
            "Sautee",
            "Deep frying",
            "Shallow frying",
            "Baking",
            "Stewing ",
            "Stewing"
        ),


        Kuis(
            "Yang termasuk metode memasak panas kering yaitu….",
            "Braising, baking, roasting",
            "Braising, boiling, grilling",
            "Roasting, baking, grilling",
            "Roasting, deep frying, stewing",
            "Stewing, grilling, pan frying",
            "Roasting, baking, grilling"
        ),

        Kuis(
            "Pengolahan makanan dengan uap panas disebut….",
            "Steaming",
            "Stewing",
            "Simmering",
            "Boiling",
            "Blanching ",
            "Steaming"
        ),


        Kuis(
            "Setelah direbus, sayuran segera diangkat dan dicelupkan ke dalam air es untuk menghentikan proses pemasakan lebih lanjut merupakan teknik memasak….",
            "Blanching",
            "Boiling",
            "Braising",
            "Stewing",
            "Simmering",
            "Blanching"
        ),


        Kuis(
            "Gambar berikut merupakan teknik memasak….",
            "Boiling",
            "Poaching",
            "Simmering",
            "Braising",
            "Stewing",
            "Poaching"
        ),

        Kuis(
            "Memasak bahan makanan dengan menggunakan minyak yang benar-benar banyak sampai bahan makanan yang diolah terendam oleh minyak/lemak disebut dengan teknik memasak….",
            "Roasting",
            "Grilling",
            "Baking",
            "Shallow frying",
            "Deep frying",
            "Deep frying"
        ),

        Kuis(
            "Suhu yang dibutuhkan dalam proses memasak menggunakan metode deep frying adalah….",
            "170oC",
            "200oC",
            "120oC",
            "100oC",
            "50oC",
            "170oC"
        ),

        Kuis(
            "Dalam pembuatan produk pastry menggunakan teknik….",
            "Roasting",
            "Grilling",
            "Baking",
            "Braising",
            "Frying",
            "Baking"
        ),

        Kuis(
            " Teknik menggoreng dengan sedikit minyak, hanya untuk melumasi wajan saat memasak, wajan yang digunakan cenderung datar, disebut teknik memasak….",
            "Stir frying",
            "Pan frying",
            "Deep frying",
            "Poaching",
            "Baking",
            "Pan frying"
        ),

        Kuis(
            "Teknik memasak dalam oven atau pemanggang dengan menggunakan lemak atau minyak adalah….",
            "Baking",
            "Roasting",
            "Grilling",
            "Deep frying",
            "Shallow frying",
            "Roasting"
        ),

        Kuis(
            "Teknik pengolahan makanan dimana bahan makanan bersentuhan langsung dengan bara api disebut….",
            "Boiling",
            "Baking",
            "Deep frying",
            "Grilling",
            "Roasting",
            "Grilling"
        ),

        Kuis(
            "Hidangan dibawah ini yang menggunakan teknik deep frying, kecuali….",
            "Donat",
            "French fries",
            "Ayam goreng",
            "Tempura",
            "Lemper",
            "Lemper"
        ),

        Kuis(
            "Opor ayam merupakan hasil masakan dengan menggunakan teknik….",
            "Boiling",
            "Stewing",
            "Simmering",
            "Braising",
            "Poaching",
            "Stewing"
        )


    )
    val KuisMateriEmpat = mutableListOf<KuisB>(


        KuisB(
            "Tumbuh-tumbuhan yang berasal dari daerah dingin dan biasanya digunakan dalam keadaan masih segar disebut...",
            "Bumbu dasar",
            "Rempah (spices)",
            "Bumbu (herbs)",
            "Bumbu dan rempah",
            "Bumbu (herbs)"
        ),


        KuisB(
            "Rempah adalah...",
            "Bumbu basah",
            "Bumbu kering",
            "Seasoning",
            "Herbs",
            "Bumbu kering"
        ),


        KuisB(
            "Berdasarkan jenisnya bumbu diklasifikasikan menjadi ….",
            "Bumbu basah dan bumbu kering",
            "Bumbu basah dan bumbu buatan",
            "Bumbu basah dan bumbu dapur",
            "Bumbu kering dan bumbu buatan",
            "Bumbu basah dan bumbu kering"
        ),


        KuisB(
            "Fungsi bumbu dan rempah dapat menampah nafsu makan karena...",
            "Menambah warna, rasa, dan aroma pada masakan",
            "Menambah warna, rasa, dan aroma bahan alami masakan",
            "Menambah warna, rasa dan aroma pada bumbu masakan",
            "Menambah warna, rasa dan aroma alami masakan",
            "Menambah warna, rasa, dan aroma pada masakan"
        ),


        KuisB(
            "Yang termasuk klasifikasi bumbu menurut asalnya yaitu...",
            "Akar, biji, dan sayur",
            "Sayur, buah, dan biji",
            "Biji, akar, dan batang",
            "Biji, batang, sayur",
            "Biji, akar, dan batang"
        ),


        KuisB(
            "Bumbu yang berasal dari bunga, berbentuk bintang delapan, ujungnya berisi biji pipih, dan aromanya mirip adas merupak ciri-ciri dari...",
            "Cengkeh",
            "Bunga lawang",
            "Kecombrang",
            "Jinten ",
            "Bunga lawang"
        ),
        KuisB(
            "Dibawah ini gambar bumbu yang menghasilkan warna hitam pada masakan adalah...",
            "a", "b", "c", "d", "a"
        ),


        KuisB(
            "Gambar berikut adalah bumbu yang berasal dari akar yakni...",
            "Kencur",
            "Kunyit",
            "Jahe",
            "Lengkuas", "Kunyit"
        ),

        KuisB(
            "Bumbu kering yang memiliki ciri berwarna putih, bulat, ada juga yang berwarna hijau dan memiliki bau yang tajam adalah...",
            "Kapulaga",
            "Pala",
            "Jinten",
            "Kemiri",
            "Kapulaga"
        ),

        KuisB(
            "Gambar berikut adalah....",
            "Cengkeh",
            "Bunga lawang",
            "Kapulaga",
            "Kayu manis ", "Cengkeh"
        ),

        KuisB(
            "Gambar berikut adalah bumbu kering yakni...",
            "Kemiri",
            "Kapulaga",
            "Pala",
            "merica",
            "Kemiri"
        ),

        KuisB(
            "Masakan yang dihasilkan dengan bumbu dasar merah mempunyai rasa...",
            "Segar",
            "Gurih",
            "Pedas",
            "Manis",
            "Pedas"
        ),

        KuisB(
            "Salah satu bahan utama untuk membuat bumbu dasar kuning adalah...",
            "Lengkuas",
            "Kunyit",
            "Kencur",
            "Jahe",
            "Kunyit"
        ),


        KuisB(
            "Bahan dasar dari bumbu putih adalah...",
            "Bawang merah + cabai rawit + jahe + kemiri",
            "Kemiri + bawang putih + bawang merah",
            "Cabai merah + bawang merah + bawang putih",
            "Bawang merah + bawang putih + santan",
            "Kemiri + bawang putih + bawang merah"
        ),

        KuisB(
            "Untuk mengolah masakan rendang dapat menggunakan bumbu dasar...",
            "Merah",
            "Kuning",
            "Merah dan kuning",
            "Putih ",
            "Merah"
        ),

        KuisB(
            "Yang termasuk bahan untuk pembuatan bumbu dasar merah adalah...",
            "Asam",
            "Kencur",
            "Cabai",
            "Paprika ",
            "Cabai"
        ),


        KuisB(
            "Bumbu yang telah dihaluskan dan benar-benar dalam keadaan matang dapat disimpan di kulkas dan dapat digunakan dalam jangka waktu...",
            "3 bulan",
            "4 bulan",
            "5 bulan",
            "6 bulan ",
            "3 bulan"
        ),


        KuisB(
            "Bumbu dasar yang cocok digunakan untuk masakan semur adalah …..",
            "Bumbu dasar merah",
            "Bumbu dasar putih",
            "Bumbu dasar kuning",
            "Bumbu dasar orange", "Bumbu dasar putih"
        ),


        KuisB(
            "Bumbu dasar merah dapat digunakan pada masakan berikut ini …..",
            "Soup ",
            "Semur",
            "Balado ",
            "Lodeh",
            "Balado"
        ),


        KuisB(
            "Cara penyimpanan yang baik untuk bumbu segar dapat dilakukan dengan cara berikut, kecuali...",
            "Disimpan dalam lemari pendingin dengan carabumbu dicuci, disimpan dalam kotak sayur, dibungkus dalam kantong plastik",
            "Bumbu disimpan dalam ruangan dengan temperatur 27°C sampai 28°C dalam keadaan terbuka maupun tertutup dengan sirkulasi udara yang baik agar bumbu tidak cepat membusuk",
            "Untuk bumbu yang banyak mengandung air sebaiknya disimpan dengan cara digantung dalam keranjang yang berlubang-lubang dan sekali-kali dijemur",
            "Dicuci dan langsung disimpan rapat di dalam plastik",
            "Dicuci dan langsung disimpan rapat di dalam plastik"
        )


    )


}

class Kuis(quiz: String, A: String, B: String, C: String, D: String, E: String, Answer: String) {
    val quiz = quiz
    val A = A
    val B = B
    val C = C
    val D = D
    val E = E
    val Answer = Answer
}

class KuisB(quiz: String, A: String, B: String, C: String, D: String, Answer: String) {
    val quiz = quiz
    val A = A
    val B = B
    val C = C
    val D = D
    val Answer = Answer
}