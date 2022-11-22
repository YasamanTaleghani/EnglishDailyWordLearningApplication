package com.example.englishdailywordlearningapplication.data.source

import com.example.englishdailywordlearningapplication.data.Word
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordDataRepository @Inject constructor(private val wordLocalDataSource: WordDataSource):
    WordRepository {

    override suspend fun getWords(): List<Word> {
        return wordLocalDataSource.getWords()
    }

}