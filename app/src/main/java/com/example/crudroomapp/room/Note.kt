package com.example.crudroomapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description : String,
    val writer : String,
    val publisher : String,
    val publication : String
)
