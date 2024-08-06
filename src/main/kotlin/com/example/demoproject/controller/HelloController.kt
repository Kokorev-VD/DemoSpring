package com.example.demoproject.controller

import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

class HelloResponse(val message: String = "Hello!")

class HelloRequest(val name: String)

@RestController
class HelloController {
    @GetMapping("/hello/{id}")
    fun hi(@PathVariable("id") id: Long) = HelloResponse("Hello, $id")

    @PostMapping("/hello")
    fun postHi(@RequestParam("id") id: Long) = HelloResponse("Hello, $id")

    @PostMapping("/hello/save")
    fun postSave(@RequestBody request: HelloRequest) = HelloResponse("Hello, ${request.name}")
}
