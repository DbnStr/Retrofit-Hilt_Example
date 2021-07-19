package com.example.hilt_retrofit_example

import com.example.hilt_retrofit_example.data.MainRemoteData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(
    private val remoteData : MainRemoteData
) {

    suspend fun getUser(userId : Int) = remoteData.getUser(userId)
}