package com.example.englishdailywordlearningapplication.data.source.local

import androidx.room.*
import com.example.englishdailywordlearningapplication.data.Word

@Dao
interface WordDao {

    @Query("SELECT * FROM Elementary")
    suspend fun getWords(): List<Word>

    @Insert
    suspend fun insertWord(user: Word)

    @Update
    suspend fun updateWord(user: Word)

    @Delete
    suspend fun deleteWord(user: Word)
}