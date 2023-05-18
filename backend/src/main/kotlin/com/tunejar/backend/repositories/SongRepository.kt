package com.tunejar.backend.repositories


import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository


@Repository
interface SongRepository: JpaRepository<Song, Long>