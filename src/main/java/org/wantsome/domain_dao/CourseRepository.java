package org.wantsome.domain_dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private List<Course> courses;
    private long idCount =1L;

    public CourseRepository() { courses = new ArrayList<>(); }

    public List<Course>() findCourses(){
        return List.of(
                new Course(1L, "Spring", "2345", "Valentin"),
                new Course(2L, "Java", "8976712","Alexandru"),
                new Course(5L, "Gradinarit", "97245", "Veronica"),
                new Course(4L, "Alpinism", "21398", "Costel")
        );
    }
    public List<Course> findAll(){
        return courses;}
    public void save(Course course){
        course.setId(idCount++);
        System.out.println("Course saved " + course);
    }
}
