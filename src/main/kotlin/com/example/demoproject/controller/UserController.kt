package com.example.demoproject.controller

import com.example.demoproject.dto.UserDto
import com.example.demoproject.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    val service: UserService,
) {
    @Autowired
    lateinit var service1 : UserService

    @PostMapping("/auth/login")
    fun login(@RequestBody request: UserDto) = service1.login(request)

    @PostMapping("/auth/register")
    fun register(@RequestBody request: UserDto) = service.register(request)
}