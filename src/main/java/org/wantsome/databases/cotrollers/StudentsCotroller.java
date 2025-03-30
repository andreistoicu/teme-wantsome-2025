package org.wantsome.databases.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wantsome.databases.dao_repository_domain.entity.Course;
import org.wantsome.databases.dao_repository_domain.entity.Student;
import org.wantsome.databases.service.CourseService;
import org.wantsome.databases.service.StudentService;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/students")
public class StudentsCotroller {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";
    }

    @GetMapping("/new")
    public String showAddStudentForm(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseService.getAllCourses());
        return "students/new";
    }
    @PostMapping
    public  String saveStudent(@ModelAttribute Student student, @RequestParam List<Long> courseIds){
        List<Course> selectedCourses = courseIds.stream()
                .map(courseService::getCourseById)
                .collect(Collectors.toList());
        student.setCourses(selectedCourses);
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/{id}")
    public String viewStudent(@PathVariable Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "students/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
