package com.example.englishdailywordlearningapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Elementary")
data class Word(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "word") val name: String,
    @ColumnInfo(name = "meaning") val meaning: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "example") val example: String
)