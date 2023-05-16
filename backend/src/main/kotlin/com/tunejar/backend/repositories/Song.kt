package com.tunejar.backend.repositories

import jakarta.persistence.*

@Table(name = "music")
@Entity
data class Song(
        @Lob
        var title: String,
        var author: String,
        var releaseYear: Int,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        var id: Long? = null
)