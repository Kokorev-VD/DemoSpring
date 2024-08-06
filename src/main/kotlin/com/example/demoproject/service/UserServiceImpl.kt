package com.example.demoproject.service

import com.example.demoproject.dto.AuthResponse
import com.example.demoproject.dto.UserDto
import com.example.demoproject.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val repository: UserRepository,
) : UserService {
    override fun register(request: UserDto): AuthResponse {
        for(user in repository.users){
            if(user.name == request.name){
                return AuthResponse("Такой пользователь уже существует")
            }
        }
        repository.users.add(request)
        return AuthResponse("ОК")
    }

    override fun login(request: UserDto): AuthResponse {
        if(repository.users.find{ it == request } != null) {
            return AuthResponse("OK")
        }
        return AuthResponse("Что-то пошло не так...")
    }
}