package com.example.englishdailywordlearningapplication.module

import com.example.englishdailywordlearningapplication.data.cache.PreferenceInterface
import com.example.englishdailywordlearningapplication.data.cache.UserPreference
import com.example.englishdailywordlearningapplication.data.source.WordDataSource
import com.example.englishdailywordlearningapplication.data.source.local.WordLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AnalyticsModule {

    @Binds
    abstract fun provideWordDataSource(wordLocalDataSource: WordLocalDataSource): WordDataSource

    @Binds
    abstract fun provideUserPreference(userPreference: UserPreference): PreferenceInterface
}