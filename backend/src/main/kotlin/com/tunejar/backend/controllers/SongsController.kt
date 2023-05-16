package com.tunejar.backend.controllers

import com.tunejar.backend.repositories.Song
import com.tunejar.backend.repositories.SongRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

import org.springframework.web.bind.annotation.CrossOrigin


@RestController
@CrossOrigin
class SongsController(private val songRepository: SongRepository) {

    @GetMapping("/hello")
    fun hola(): String = "Hola desde el backend"

    @GetMapping("/songs")
    fun allSongs(): List<Song?>? {
        return songRepository.findAll()
    }

    @GetMapping("/songs/{id}")
    fun findSong(@PathVariable id: Long): Song? {
        return songRepository.findById(id).orElseThrow { SongNotFoundException() }
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "song not found")
class SongNotFoundException : RuntimeException()



