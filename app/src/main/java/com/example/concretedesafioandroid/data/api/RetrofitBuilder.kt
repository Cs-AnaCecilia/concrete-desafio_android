package com.example.concretedesafioandroid.data.api

import com.example.concretedesafioandroid.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private fun retrofitRepositories(): Retrofit{
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
    val repositoriesApi: ApiService = retrofitRepositories().create(ApiService::class.java)

}