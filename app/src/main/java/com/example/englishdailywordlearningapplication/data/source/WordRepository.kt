package com.example.englishdailywordlearningapplication.data.source

import com.example.englishdailywordlearningapplication.data.Word

interface WordRepository {
    suspend fun getWords(): List<Word>
}