package com.example.mvvm_dagger_retrofit.di

import android.content.Context
import androidx.room.Room
import com.example.mvvm_dagger_retrofit.db.FakerDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun ProvideFakerDB(context: Context):FakerDataBase{
        return Room.databaseBuilder(context,FakerDataBase::class.java,"FakerDb").build()
    }

}