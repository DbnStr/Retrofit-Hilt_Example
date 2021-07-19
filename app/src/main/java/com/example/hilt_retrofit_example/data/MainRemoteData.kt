package com.example.hilt_retrofit_example.data

import com.example.hilt_retrofit_example.api.MainService
import javax.inject.Inject

class MainRemoteData @Inject constructor(private val mainService : MainService) {

    suspend fun getUser(userId : Int) = mainService.getUser(userId)
}