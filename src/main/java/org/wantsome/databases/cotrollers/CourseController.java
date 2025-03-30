package org.wantsome.databases.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wantsome.databases.dao_repository_domain.entity.Course;
import org.wantsome.databases.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String listCourses(Model model){
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses/list";
    }

    @GetMapping("/new")
    public String showAddCourseForm(Model model){
        model.addAttribute("course", new Course());
        return "courses/new";
    }
    @PostMapping
    public String saveCourse(@ModelAttribute Course course){
        courseService.saveCourse(course);
        return "redirect:/courses";
    }
}
