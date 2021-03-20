package ru.alx.testretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.alx.testretrofit.repository.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val mainViewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, mainViewModelFactory).get(MainViewModel::class.java)
        viewModel.getUser()
        viewModel.myResponse.observe(this, Observer {   response ->
            Log.d("Response", response.id.toString())
            Log.d("Response", response.firstname)
            Log.d("Response", response.lastname)
            Log.d("Response", response.username)
            Log.d("Response", response.bio)

        })
    }
}