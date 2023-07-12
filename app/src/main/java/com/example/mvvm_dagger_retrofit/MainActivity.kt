package com.example.mvvm_dagger_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_dagger_retrofit.databinding.ActivityMainBinding
import com.example.mvvm_dagger_retrofit.di.ApplicationComponent
import com.example.mvvm_dagger_retrofit.viewmodels.MainViewModel
import com.example.mvvm_dagger_retrofit.viewmodels.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        (application as FakerApplication).applicationComponent.inject(this)
   //     val map = (application as FakerApplication).applicationComponent.getMap()
        mainViewModel = ViewModelProvider(this, mainViewModelFactory)[MainViewModel::class.java]

        mainViewModel.productLiveData.observe(this, Observer {

            binding.Product.text = it.products?.joinToString { x -> x.title + "\n\n" }

        })
    }
}