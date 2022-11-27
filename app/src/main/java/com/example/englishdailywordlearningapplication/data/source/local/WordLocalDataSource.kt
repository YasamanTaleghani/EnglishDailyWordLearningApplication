package com.example.englishdailywordlearningapplication.data.source.local

import com.example.englishdailywordlearningapplication.data.Result
import com.example.englishdailywordlearningapplication.data.Result.Success
import com.example.englishdailywordlearningapplication.data.Result.Error
import com.example.englishdailywordlearningapplication.data.Word
import com.example.englishdailywordlearningapplication.data.source.WordDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordLocalDataSource @Inject constructor(
    private val dao: WordDao,
    private val ioDispatcher: CoroutineDispatcher): WordDataSource {

    override suspend fun getWords(): Result<List<Word>> = withContext(ioDispatcher) {
        return@withContext try {
            Success(dao.getWords())
        } catch (e: Exception) {
            Error(e)
        }
    }
}