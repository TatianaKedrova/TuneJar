package com.tunejar.backend.controllers

import com.tunejar.backend.repositories.Song
import com.tunejar.backend.repositories.SongRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class SongsController(private val songRepository: SongRepository) {

    @GetMapping("/songs")
    fun allSongs(): List<Song?>? {
        return songRepository.findAll()
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "song not found")
class SongNotFoundException : RuntimeException()
