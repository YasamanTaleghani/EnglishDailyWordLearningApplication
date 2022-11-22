package com.example.englishdailywordlearningapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Elementary")
data class Word(
    @PrimaryKey val id: Int = 0,
    @ColumnInfo(name = "word") var name: String = "",
    @ColumnInfo(name = "meaning") var meaning: String = "",
    @ColumnInfo(name = "type") var type: String = "",
    @ColumnInfo(name = "example") var example: String = "",
    @ColumnInfo(name = "status") var status: Int = 0
)