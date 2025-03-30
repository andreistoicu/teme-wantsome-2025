package org.wantsome.databases.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.wantsome.databases.dao_repository_domain.StudentJpaRepository;
import org.wantsome.databases.dao_repository_domain.entity.Student;

import java.util.List;

@Service
public class StudentService {

    private final StudentJpaRepository studentJpaRepository;

    public StudentService(StudentJpaRepository studentJpaRepository) {
        this.studentJpaRepository = studentJpaRepository;
    }
    @Transactional
    public void saveStudent(Student student){
        studentJpaRepository.save(student);
    }

    public Student getStudentById(Long id){
        return studentJpaRepository.findById(id).orElse(null);
    }
    public List<Student> getAllStudents(){
        return studentJpaRepository.findAll();
    }
    public void deleteStudent(Long id){
        studentJpaRepository.deleteById(id);
    }

    public StudentJpaRepository getStudentJpaRepository() {
        return studentJpaRepository;
    }
}
