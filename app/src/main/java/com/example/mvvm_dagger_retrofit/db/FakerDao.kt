package com.example.mvvm_dagger_retrofit.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvm_dagger_retrofit.models.Product

@Dao
interface FakerDao {

    @Insert
   suspend fun addProduct(product: List<Product>)

   @Query("SELECT * FROM Product")
   suspend fun getProduct():List<Product>
}