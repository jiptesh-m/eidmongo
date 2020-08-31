package com.iddink.eidmongo.service;

import com.iddink.eidmongo.model.Employee;
import com.iddink.eidmongo.model.student.Student;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student create(Student student);

    public List<Student> findAll();

    public Optional<Student> findStudentById(long id);

    public void deleteStudent(long id);

    public void updateStudent(Student student);

}
