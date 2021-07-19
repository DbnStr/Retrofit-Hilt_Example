package com.example.hilt_retrofit_example.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.hilt_retrofit_example.MainRepository
import com.example.hilt_retrofit_example.data.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel(){

    fun getUser(userId : Int) : LiveData<User> {
        return liveData {
            val data = repository.getUser(userId)
            data.body()?.let { emit(it) }
        }
    }
}