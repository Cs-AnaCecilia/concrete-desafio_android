package com.example.concretedesafioandroid.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.concretedesafioandroid.data.api.ApiService
import com.example.concretedesafioandroid.data.repository.MainRepository
import com.example.concretedesafioandroid.ui.main.viewmodel.RepositoriesViewModel


class ViewModelFactory(
   private val apiService: ApiService
): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(RepositoriesViewModel::class.java)){
            return RepositoriesViewModel(MainRepository(apiService)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}