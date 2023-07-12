package com.example.mvvm_dagger_retrofit.db

import androidx.room.TypeConverter
import com.example.mvvm_dagger_retrofit.models.ProductX
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Converters {
    @TypeConverter
    fun fromString(value: String?): List<ProductX> {
        val listType = object : TypeToken<List<ProductX?>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list:List<ProductX?>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}