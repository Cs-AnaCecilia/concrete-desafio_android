package com.example.concretedesafioandroid.data.repository

import com.example.concretedesafioandroid.data.api.ApiService

class MainRepository (private val apiService: ApiService){
    suspend fun getRepositories() = apiService.getRepositories()
}