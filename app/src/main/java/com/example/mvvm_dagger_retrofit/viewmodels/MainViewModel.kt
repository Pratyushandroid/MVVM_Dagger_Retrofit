package com.example.mvvm_dagger_retrofit.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_dagger_retrofit.models.Product
import com.example.mvvm_dagger_retrofit.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(val repository: ProductRepository):ViewModel() {

     val productLiveData :LiveData<Product>
     get() = repository.products

    init {
        viewModelScope.launch {
             repository.getProduct()
        }
    }
}

class Randomise @Inject constructor(){

    fun doAction(){

    }
}