package com.example.restDemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class DemoRestController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello World!"
    }
}