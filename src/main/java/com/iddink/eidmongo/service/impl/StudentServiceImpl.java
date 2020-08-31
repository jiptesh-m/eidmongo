package com.iddink.eidmongo.service.impl;

import com.iddink.eidmongo.dao.StudentDAO;
import com.iddink.eidmongo.model.student.Student;
import com.iddink.eidmongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Student create(Student students) {
        return studentDAO.save(students);
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Optional<Student> findStudentById(long id) {
        return studentDAO.findById(id);
    }

    @Override
    public void deleteStudent(long id) {
        studentDAO.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.save(student);
    }
}
