package com.example.englishdailywordlearningapplication.data.source.local

import com.example.englishdailywordlearningapplication.data.Word
import com.example.englishdailywordlearningapplication.data.source.WordDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordLocalDataSource @Inject constructor(private val dao: WordDao): WordDataSource {

    override suspend fun getWords(): List<Word> {
        return dao.getWords()
    }
}