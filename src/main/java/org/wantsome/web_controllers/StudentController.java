package org.wantsome.web_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.domain_dao.Student;
import org.wantsome.service.StudentService;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentList";
    }

    @GetMapping("/studentForm")
    public String studentForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    @PostMapping("/submitStudent")
    public String saveStudent(@ModelAttribute Student student, Model model) {
        studentService.saveStudent(student);

        model.addAttribute("title", "Student");
        model.addAttribute("students", studentService.findAll());
        return "students";
    }
}