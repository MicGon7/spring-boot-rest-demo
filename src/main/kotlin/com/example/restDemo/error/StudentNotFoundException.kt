package com.example.restDemo.error

import java.lang.RuntimeException

class StudentNotFoundException(override val message: String?) : RuntimeException(message)
