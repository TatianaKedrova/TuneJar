package com.tunejar.backend.repositories

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component



@Component
class DataLoader (private val repository: SongRepository) {
    @PostConstruct
    fun load() {
        val songList = listOf(
                Song("Smells Like Teen Spirit",
                        "Nirvana",
                        1991),
                Song("Billie Jean",
                        "Michael Jackson",
                        1982),


        )
        repository.saveAll(songList)
        println("cargamos canciones: $songList")
    }
}