package com.example.mvvm_dagger_retrofit.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Product")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val limit: Int? = null,
    val products: List<ProductX>? = null,
    val skip: Int? = null,
    val total: Int? = null
)