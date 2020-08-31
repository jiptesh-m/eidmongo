package com.iddink.eidmongo.dao;

import com.iddink.eidmongo.model.student.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends MongoRepository<Student, Long> {
}
