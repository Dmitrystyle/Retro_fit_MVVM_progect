package com.example.retrofit.coroutines.data.repository

import com.example.retrofit.coroutines.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}