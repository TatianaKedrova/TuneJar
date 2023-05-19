package com.tunejar.backend.repositories

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component


@Component
class DataLoader (private val songRepository: SongRepository) {
    @PostConstruct
    fun load() {
        val songList = listOf(
                Song("https://www.rollingstone.com/wp-content/uploads/2021/09/497-kanye-west-stronger.jpg?w=500",
                "Stronger",
                        "Kanye West",
                        "Rap",
                        2007),
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
                Song("https://www.rollingstone.com/wp-content/uploads/2021/09/468-mazzy-star-fade-into-you.jpg?w=500",
                        "Mazzy Star",
                        "Fade Into You",
                        "Rock",
                        1974),
                Song("https://www.rollingstone.com/wp-content/uploads/2021/09/458-beck-loser.jpeg?w=306",
                        "Loser",
                        "Beck",
                        "Alternative",
                        1974),
        )
        songRepository.saveAll(songList)
        println("we load songs: $songList")
    }
}