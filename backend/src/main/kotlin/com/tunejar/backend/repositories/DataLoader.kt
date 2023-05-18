package com.tunejar.backend.repositories

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component


@Component
class DataLoader (private val songRepository: SongRepository) {
    @PostConstruct
    fun load() {
        val songList = listOf(
                Song("https://www.google.com/url?sa=i&url=https%3A%2F%2Fopen.spotify.com%2Ftrack%2F24tndOV6pnJOXEccM6vImO&psig=AOvVaw0CVymnuFiconjCiGHP9W9f&ust=1684492809841000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPCQvu7W_v4CFQAAAAAdAAAAABAE",
                "Smells Like Teen Spirit",
                        "Nirvana",
                        "Rock",
                        1991),
                Song("https://www.rollingstone.com/wp-content/uploads/2020/09/R1344-491-harry-styles-fine-line.jpg?w=1000",
                        "Fine Line",
                        "Harry Styles",
                        "Pop",
                        2019),
                Song("https://www.rollingstone.com/wp-content/uploads/2020/09/R1344-493-Marvin-Gaye-Here-My-Dear.jpg?w=1000",
                        "Here, My Dear",
                        "Marvin Gaye",
                        "R&B",
                        1978),
                Song("https://www.rollingstone.com/wp-content/uploads/2020/09/R1344-476-Kimono-My-House.jpg?w=1000",
                        "Kimono My House",
                        "Sparks",
                        "R&B",
                        1974),
        )
        songRepository.saveAll(songList)
        println("we load songs: $songList")
    }
}