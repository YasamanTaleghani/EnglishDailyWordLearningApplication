package com.example.englishdailywordlearningapplication.data.source

import com.example.englishdailywordlearningapplication.data.Word
import com.example.englishdailywordlearningapplication.data.source.local.WordDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(private val dao: WordDao) {

    suspend fun getWords(): List<Word> {
        return dao.getWords()
    }
}