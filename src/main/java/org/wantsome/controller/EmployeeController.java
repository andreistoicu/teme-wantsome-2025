package org.wantsome.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.dao.Employee;
import org.wantsome.dao.EmployeeForm;
import org.wantsome.service.EmployeeService;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employeeForm")
    public String getEmployees(Model model){
        model.addAttribute("employeeForm" , new EmployeeForm());
        return "formEmployee";
    }

    @PostMapping("/listEmployee")
    public String listEmployees(@Valid @ModelAttribute("employeeForm") EmployeeForm employeeForm ,
                                BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()){
            return "formEmployee";
        }

        Employee employee = new Employee(
                employeeForm.getName(),
                employeeForm.getDepartment(),
                employeeForm.getEmail(),
                employeeForm.getSalary()
        );

        employeeService.addEmployee(employee);
        model.addAttribute("employees", employeeService.getEmployees());
        return "listEmployees";
    }
}
