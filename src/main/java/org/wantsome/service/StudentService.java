package org.wantsome.service;

import org.springframework.stereotype.Service;
import org.wantsome.domain_dao.Student;
import org.wantsome.domain_dao.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> listStudents(){
        return studentRepository.findAll();
    }

    public Long saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Object findAll() {
        return null;
    }
}
