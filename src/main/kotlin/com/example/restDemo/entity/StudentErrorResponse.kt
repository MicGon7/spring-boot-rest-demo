package com.example.restDemo.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class StudentErrorResponse(
        @JsonProperty("status")
        val status: Int,
        @JsonProperty("message")
        val message: String,
        @JsonProperty("timeStamp")
        val timeStamp: Long
)
