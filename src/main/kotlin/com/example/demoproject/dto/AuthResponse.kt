package com.example.demoproject.dto

enum class Response(val response: String){
    OK("OK"), BAD_REQUEST("Что-то пошло не так...")
}

class AuthResponse(val message: String)