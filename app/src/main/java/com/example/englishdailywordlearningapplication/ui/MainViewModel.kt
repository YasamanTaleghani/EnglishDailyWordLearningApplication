package com.example.englishdailywordlearningapplication.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.englishdailywordlearningapplication.data.Result.Success
import com.example.englishdailywordlearningapplication.data.Word
import com.example.englishdailywordlearningapplication.data.cache.PreferenceInterface
import com.example.englishdailywordlearningapplication.data.source.WordDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val wordDataRepository: WordDataRepository,
    private val userPreference: PreferenceInterface) : ViewModel() {

    private val _wordList : MutableLiveData<List<Word>> by lazy { MutableLiveData<List<Word>>() }
    val wordList = _wordList

    private val systemLogTime: Flow<String> = flow {
        while (true) {
            Log.d("TAG", "logEvery5Sec: ${System.currentTimeMillis()}")
            val time = System.currentTimeMillis()
            emit(time.toString())
            delay(10000L)
        }
    }

    init {
        getWords()
    }

    private fun getWords() {
        viewModelScope.launch {
            wordDataRepository.getWords().let { result ->
                if (result is Success) {
                    val words = result.data
                    _wordList.value = words
                }
            }
        }
    }
}