package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        val albumes: MutableList<Album> = mutableListOf()
        albumes.add(Album("Tigre","24/04/2024","https://cdn.pixabay.com/photo/2023/12/07/19/45/tiger-8436227_1280.jpg"))
        albumes.add(Album("Pollo","24/04/2024","https://cdn.pixabay.com/photo/2023/10/19/21/08/ai-generated-8327632_1280.jpg"))
        albumes.add(Album("Cielo","24/04/2024","https://cdn.pixabay.com/photo/2023/03/05/16/44/pier-7831868_960_720.jpg"))
        albumes.add(Album("Hielo","24/04/2024","https://cdn.pixabay.com/photo/2024/04/04/12/26/ai-generated-8675021_960_720.png"))

        return albumes
    }
}