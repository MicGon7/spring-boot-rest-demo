package com.example.restDemo.entity

import com.fasterxml.jackson.annotation.JsonProperty

class Student(
        @JsonProperty("firstName")
        val firstName: String,
        @JsonProperty("lastName")
        val lastName: String
)
