package com.example.mvvm_dagger_retrofit.retrofit

import com.example.mvvm_dagger_retrofit.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("/products")
    suspend fun getProducts():Response<Product>
}