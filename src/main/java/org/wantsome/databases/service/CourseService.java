package org.wantsome.databases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wantsome.databases.dao_repository_domain.CourseRepository;
import org.wantsome.databases.dao_repository_domain.entity.Course;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public Course getCourseById(Long id){
        return courseRepository.findById(id).orElse(null);
    }
    public void saveCourse(Course course){
        courseRepository.save(course);
    }
}
