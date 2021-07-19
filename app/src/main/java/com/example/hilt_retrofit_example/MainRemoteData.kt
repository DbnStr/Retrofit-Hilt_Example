package com.example.hilt_retrofit_example

import javax.inject.Inject

class MainRemoteData @Inject constructor(private val mainService : MainService) {

    suspend fun getUser(userId : Int) = mainService.getUser(userId)
}