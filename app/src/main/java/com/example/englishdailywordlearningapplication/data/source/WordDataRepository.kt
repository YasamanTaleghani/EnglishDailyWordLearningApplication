package com.example.englishdailywordlearningapplication.data.source

import kotlinx.coroutines.*
import javax.inject.Inject
import javax.inject.Singleton
import com.example.englishdailywordlearningapplication.data.Result.Error
import com.example.englishdailywordlearningapplication.data.Result
import com.example.englishdailywordlearningapplication.data.Word

@Singleton
class WordDataRepository @Inject constructor(private val wordLocalDataSource: WordDataSource,
                                             private val ioDispatcher: CoroutineDispatcher): WordRepository {

    override suspend fun getWords(): Result<List<Word>> = withContext(ioDispatcher) {
        return@withContext try {
            wordLocalDataSource.getWords()
        } catch (e: Exception) {
            Error(e)
        }
    }
}