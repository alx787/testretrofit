package ru.alx.testretrofit.api

import retrofit2.http.GET
import ru.alx.testretrofit.model.User
//import io.reactivex.Observable

interface SimpleApi {

    @GET("api/user/")
    suspend fun getUser(): User
}