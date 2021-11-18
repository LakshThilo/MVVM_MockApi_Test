package com.lak.mvvm_architecture.data.repository

import com.lak.mvvm_architecture.data.api.ApiService
import com.lak.mvvm_architecture.data.model.User
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}