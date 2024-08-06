package com.example.demoproject.service

import com.example.demoproject.dto.AuthResponse
import com.example.demoproject.dto.UserDto

interface UserService {
    fun register(request: UserDto) : AuthResponse
    fun login(request: UserDto) : AuthResponse
}