package com.example.englishdailywordlearningapplication.data.cache

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.Preferences.Key
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreference @Inject constructor(
    @ApplicationContext private val context: Context
) : PreferenceInterface {
    private val Context.dataStore: DataStore<Preferences>
            by preferencesDataStore(name = DATA_STORE_NAME)

    val userPracticeDay: Flow<String?>
        get() = getData(USER_PRACTICE_DAY)

    override suspend fun saveUserPracticeDay(userDay: String) {
        context.dataStore.edit { mutablePreferences ->
            mutablePreferences[USER_PRACTICE_DAY] = userDay
        }
    }

    private fun <T> getData(key: Key<T>): Flow<T?> =
        context.dataStore.data
            .map { preferences -> preferences[key] }

    companion object {
        const val DATA_STORE_NAME = "jus_law_data_store"
        val USER_PRACTICE_DAY = stringPreferencesKey("user_practice_day")
        const val TEST_DATA = "test"
    }
}