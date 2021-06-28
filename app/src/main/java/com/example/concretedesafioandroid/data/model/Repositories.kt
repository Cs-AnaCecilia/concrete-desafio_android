package com.example.concretedesafioandroid.data.model

import com.google.gson.annotations.SerializedName

data class Repositories(
    @SerializedName("id") val id: Int,
    @SerializedName("forks_count") val forksCount: Int,
    @SerializedName("name") val username: String,
    @SerializedName("description") val description: String,
    @SerializedName("stargazers_url") val stars: Int,
    @SerializedName("full_name") val fullName: String,
    @SerializedName("owner") val owner: Owner
)