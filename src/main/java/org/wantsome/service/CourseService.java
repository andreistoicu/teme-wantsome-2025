package org.wantsome.service;

import org.springframework.stereotype.Service;
import org.wantsome.domain_dao.Course;
import org.wantsome.domain_dao.CourseRepository;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
   /* public Object findAll() {
    }
    public void save(Course course) {
    }*/

}
