package com.example.englishdailywordlearningapplication.data.source

import com.example.englishdailywordlearningapplication.data.Result
import com.example.englishdailywordlearningapplication.data.Word

interface WordDataSource {
    suspend fun getWords(): Result<List<Word>>
}