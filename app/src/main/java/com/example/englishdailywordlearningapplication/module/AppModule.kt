package com.example.englishdailywordlearningapplication.module

import android.content.Context
import androidx.room.Room
import com.example.englishdailywordlearningapplication.data.source.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideYourDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, AppDatabase::class.java, "DemoDatabase.db")
        .createFromAsset("test.db")
        .build()

    @Singleton
    @Provides
    fun provideYourDao(db: AppDatabase) = db.userDao()

    @Provides
    fun provideIoDispatcher() = Dispatchers.Main
}