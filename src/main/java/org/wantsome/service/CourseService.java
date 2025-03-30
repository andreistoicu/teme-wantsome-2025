package org.wantsome.service;

import org.springframework.stereotype.Service;
import org.wantsome.domain_dao.Course;
import org.wantsome.domain_dao.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {  this.courseRepository = courseRepository;    }

    public List<Course> findAll() {   return courseRepository.findAll();    }

    public void saveCourse(Course course) {  courseRepository.save(course);    }

    public void save(Course course) {
    }
}
