package com.example.mvvm_dagger_retrofit.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mvvm_dagger_retrofit.models.Product

@Database(entities = [Product::class], version = 1)
@TypeConverters(Converters::class)
abstract class FakerDataBase : RoomDatabase(){
abstract fun getFakerDao ():FakerDao
}
