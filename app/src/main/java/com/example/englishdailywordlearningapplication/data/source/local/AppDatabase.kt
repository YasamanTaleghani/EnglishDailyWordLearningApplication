package com.example.englishdailywordlearningapplication.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.englishdailywordlearningapplication.data.Word

@Database(entities = [Word::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): WordDao

}