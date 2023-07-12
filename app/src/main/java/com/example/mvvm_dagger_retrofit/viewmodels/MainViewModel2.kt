package com.example.mvvm_dagger_retrofit.viewmodels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(private val randomise: Randomise): ViewModel() {

    init {
        randomise.doAction()
    }
}