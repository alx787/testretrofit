package ru.alx.testretrofit.repository

import ru.alx.testretrofit.api.RetrofitInstance
import ru.alx.testretrofit.model.User

class Repository {

    suspend fun getUser(): User {
        return RetrofitInstance.api.getUser()
    }

}