package org.wantsome.domain_dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> students;
    private long idCount =134L;

    public StudentRepository(){ students = new ArrayList<>();}

    public List<Student> findStudents(){
        return List.of(
                new Student(23L, "Valentin", "Chiriac", "valentin@email.com"),
                new Student(34L, "Catinca", "Iliescu", "catinca@email.com"),
                new Student(67L, "Emil", "Voicescu", "emil@email.com")
        );
    }
    public List<Student> findAll(){
        return students;
    }
    public Long save(Student student){
        student.setId(idCount++);
        System.out.println("Student saved " + student);
        return null;
    }
}
