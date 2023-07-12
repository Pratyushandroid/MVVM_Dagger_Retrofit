package com.example.mvvm_dagger_retrofit.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_dagger_retrofit.repository.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(
    private val map : Map<Class<*>,@JvmSuppressWildcards ViewModel>
    ):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }
}