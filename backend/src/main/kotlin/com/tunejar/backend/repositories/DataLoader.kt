package com.tunejar.backend.repositories

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component



@Component
class DataLoader(private val songRepository: SongRepository) {
    @PostConstruct
    fun load() {
        val songs = listOf(
                Song(title = "Smells Like Teen Spirit", author = "Nirvana", year = 1991),
                Song(title = "Billie Jean", author = "Michael Jackson", year = 1982)
        )
        songRepository.saveAll(songs)
        println("Cargamos datos de prueba cuando arrancamos el servidor: $songs")
    }
}