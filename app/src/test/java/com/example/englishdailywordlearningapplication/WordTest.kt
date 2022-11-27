package com.example.englishdailywordlearningapplication

import com.example.englishdailywordlearningapplication.data.Word
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class WordTest {
    var word = Word()

    @Before
    fun init() {
        word.apply {
            name = "bus"
            meaning = "vehicle"
            type = "noun"
            example = "I waited for bus for half an hour"
            status = 0
        }
    }

    @Test
    fun word_correct_name_ReturnsTrue() {
        assertTrue(word.name == "bus")
    }

    @Test
    fun word_false_name_ReturnsFalse() {
        assertFalse(word.name == "taxi")
    }

    @Test
    fun word_correct_meaning_ReturnTrue() {
        assertTrue(word.meaning == "vehicle")
    }

    @Test
    fun word_false_meaning_ReturnFalse() {
        assertFalse(word.meaning == "something")
    }

    @Test
    fun word_correct_type_ReturnTrue() {
        assertTrue(word.type == "noun")
    }

    @Test
    fun word_false_type_ReturnFalse() {
        assertFalse(word.type == "Noun")
    }

    @Test
    fun word_correct_example_ReturnTrue() {
        assertTrue(word.example == "I waited for bus for half an hour")
    }

    @Test
    fun word_false_example_ReturnFalse() {
        assertFalse(word.example == "I waited for bus for an hour")
    }

    @Test
    fun word_correct_status_ReturnTrue() {
        assertTrue(word.status == 0)
    }

    @Test
    fun word_false_status_ReturnFalse() {
        assertFalse(word.status == 1)
    }
}