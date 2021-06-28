package com.example.concretedesafioandroid.data.model

import com.google.gson.annotations.SerializedName

data class RepositoriesList(
    @SerializedName("items") val repositoriesList: Array<Repositories>
)