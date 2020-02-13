package com.example.restDemo.controller

import com.example.restDemo.entity.Student
import com.example.restDemo.error.StudentErrorResponse
import com.example.restDemo.error.StudentNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class StudentRestController {
    private val theStudents: List<Student> by lazy { loadData() }

    // can also use @PostConstruct instead of lazy
    fun loadData(): List<Student> {
        return listOf(
                Student("Poornima", "Petel"),
                Student("Mario", "Rossi"),
                Student("Mary", "Smith")
        )
    }

    @GetMapping("/students")
    fun getStudents(): List<Student> {
        // jackson will do the serialization to json automatically
        // it will convert the list into an json array

        return theStudents

    }

    // define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}") // @Pathvariable binds the mapping {name} to the param name. By default, both names much match
    fun getStudent(@PathVariable studentId: Int): Student {
        // check the studentId against list size
        if ((studentId >= theStudents.size) || (studentId < 0)) {
            throw StudentNotFoundException("Student id not found - $studentId")
        }

        return theStudents[studentId]
    }
}