package com.example.demoproject.repository

import com.example.demoproject.dto.UserDto
import org.springframework.stereotype.Repository

@Repository
class UserRepository {
    val users = mutableListOf<UserDto>()
}