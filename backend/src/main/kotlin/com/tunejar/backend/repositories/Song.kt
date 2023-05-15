package com.tunejar.backend.repositories

import jakarta.persistence.*

@Table(name = "songs")
@Entity
data class Song(
        var title: String,
        var author: String,
        var year: Int,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        var id: Long? = null
)