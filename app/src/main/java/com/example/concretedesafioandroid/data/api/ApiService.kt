package com.example.concretedesafioandroid.data.api

import com.example.concretedesafioandroid.data.model.RepositoriesList
import retrofit2.Response
import retrofit2.http.GET

interface ApiService{

    @GET ("/search/repositories?q=language:Java&sort=stars&page=1")
    suspend fun getRepositories(): Response<RepositoriesList>

}