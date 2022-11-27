package com.example.englishdailywordlearningapplication.module

import android.content.Context
import androidx.room.Room
import com.example.englishdailywordlearningapplication.data.cache.PreferenceInterface
import com.example.englishdailywordlearningapplication.data.cache.UserPreference
import com.example.englishdailywordlearningapplication.data.source.WordDataSource
import com.example.englishdailywordlearningapplication.data.source.local.AppDatabase
import com.example.englishdailywordlearningapplication.data.source.local.WordLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun provideWordDataSource(wordLocalDataSource: WordLocalDataSource): WordDataSource

    @Binds
    abstract fun provideUserPreference(userPreference: UserPreference): PreferenceInterface
}

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideYourDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, AppDatabase::class.java, "DemoDatabase.db")
            .createFromAsset("test.db")
            .build()

    @Singleton
    @Provides
    fun provideYourDao(db: AppDatabase) = db.userDao()
}