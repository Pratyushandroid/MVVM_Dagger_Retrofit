package com.example.mvvm_dagger_retrofit.di

import androidx.lifecycle.ViewModel
import com.example.mvvm_dagger_retrofit.viewmodels.MainViewModel
import com.example.mvvm_dagger_retrofit.viewmodels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {

//    @StringKey("mainViewModel")
    @ClassKey(MainViewModel::class)
    @Binds
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel): ViewModel

//    @StringKey("mainViewModel2")
    @ClassKey(MainViewModel2::class)
    @Binds
    @IntoMap
    abstract fun mainViewModel2(mainViewModel: MainViewModel):ViewModel
}