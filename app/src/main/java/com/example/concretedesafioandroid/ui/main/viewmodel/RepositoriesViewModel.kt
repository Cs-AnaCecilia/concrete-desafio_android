package com.example.concretedesafioandroid.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.concretedesafioandroid.data.repository.MainRepository
import com.example.concretedesafioandroid.util.Resource
import kotlinx.coroutines.Dispatchers
import java.lang.Exception


class RepositoriesViewModel(

    private val mainRepository: MainRepository
):ViewModel() {
    fun getRepositories() = liveData(Dispatchers.IO){
        emit(Resource.loading(null))
        try {
            emit(Resource.success(mainRepository.getRepositories()))
        }catch (exception: Exception){
            emit(Resource.error(data = null, message = exception.message ?:"Error Occurred!"  ))
        }

    }

}