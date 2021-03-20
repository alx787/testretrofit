package ru.alx.testretrofit.model

data class User(
    val id: Long,
    val firstname: String,
    val lastname: String,
    val username: String,
    val bio: String
)