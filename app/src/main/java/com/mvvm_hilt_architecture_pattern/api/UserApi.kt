package com.mvvm_hilt_architecture_pattern.api

import com.mvvm_hilt_architecture_pattern.model.UserRequest
import com.mvvm_hilt_architecture_pattern.model.UserResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("/users/signup")
    suspend fun signup(@Body userRequest: UserRequest): Response<UserResponseModel>

    @POST("/users/signin")
    suspend fun signin(@Body userRequest: UserRequest) : Response<UserResponseModel>
}