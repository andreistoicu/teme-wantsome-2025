package org.wantsome.web_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.domain_dao.Course;
import org.wantsome.service.CourseService;

@Controller
public class CourseController {

    private final CourseService courseService;
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/newCourse")
    public String courseForm(Model model){
        model.addAttribute("course", new Course());
        return "course/courseForm";
    }

    @PostMapping("/courses")
    public String submitCourse(Model model, @ModelAttribute Course course){
        courseService.save(course);
        model.addAttribute("courses", courseService.findAll());

        return "courses/coursesTable";
    }

    @GetMapping("/courses")
    public String getCourses(Model model){
        model.addAttribute("courses", courseService.findAll());

        return "courses/coursesTable";
    }
}
