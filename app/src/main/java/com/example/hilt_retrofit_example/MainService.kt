package com.example.hilt_retrofit_example

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MainService {

    @GET("Users/{userId}.json")
    suspend fun getUser(@Path("userId") userId : Int) : Response<User>
}