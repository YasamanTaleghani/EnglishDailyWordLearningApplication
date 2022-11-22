package com.example.englishdailywordlearningapplication.data.source.local

import com.example.englishdailywordlearningapplication.data.Word

interface WordRepository {
    suspend fun getWords(): List<Word>
}