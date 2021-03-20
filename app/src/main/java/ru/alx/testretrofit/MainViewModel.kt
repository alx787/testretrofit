package ru.alx.testretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.alx.testretrofit.model.User
import ru.alx.testretrofit.repository.Repository

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<User> = MutableLiveData()

    fun getUser() {
        viewModelScope.launch {
            val response: User = repository.getUser()
            myResponse.value = response
        }
    }

}