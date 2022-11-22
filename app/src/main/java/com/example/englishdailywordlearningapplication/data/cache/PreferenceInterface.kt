package com.example.englishdailywordlearningapplication.data.cache

interface PreferenceInterface {
    suspend fun saveUserPracticeDay(userDay: String)
}