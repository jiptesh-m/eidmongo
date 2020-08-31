package com.iddink.eidmongo.controller;

import com.iddink.eidmongo.model.student.Student;
import com.iddink.eidmongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/create")
    public ResponseEntity<Student> create(@RequestBody Student student){
        Student createdStudent = studentService.create(student);
        return ResponseEntity.ok().body(createdStudent);
    }

    @GetMapping("/all")
    public List <Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity <Student> getStudentById(@PathVariable(value = "id") Long studentId){
        Optional<Student> student = studentService.findStudentById(studentId);
        return ResponseEntity.ok().body(student.get());
    }


}
