package com.example.englishdailywordlearningapplication.data.source

import com.example.englishdailywordlearningapplication.data.Word

interface WordDataSource {
    suspend fun getWords(): List<Word>
}