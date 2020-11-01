package com.example.mediapembelajaran.ui.materi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class YoutubeViewModel : ViewModel() {

    val ytData = mutableListOf<YtId>(
        YtId("YtId", "Teknik Boilling"),
        YtId("cz7Q8ollK0s", "Teknik Poaching"),
        YtId("6qBBkgwizoA", "Teknik Braising"),
        YtId("yxQkP_Z_u9s", "Teknik Stewing"),
        YtId("IlLblLfwtD8", "Teknik Steaming"),
        YtId("MwhytnIYbE4", "Teknik Simmering"),
        YtId("dTmYQNyP7BY", "Teknik Blanching"),
        YtId("LmOK0O8vCPw", "Deep Frying"),
        YtId("ed4Ay0eaQJQ", "Pan Frying dan Sautee"),
        YtId("71lor-VziJo", "Teknik  Roasting"),
        YtId("m-94NUvzAec", "Teknik Baking"),
        YtId("VXeg8unkHnw", "Grilling"),
    )
    val YoutubeLiveData: MutableLiveData<MutableList<YtId>> = MutableLiveData(ytData)
}

class YtId(var Id: String, Caption: String) {
    val videoId = Id
    val caption = Caption


}