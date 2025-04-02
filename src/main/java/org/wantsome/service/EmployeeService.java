package org.wantsome.service;


import org.springframework.stereotype.Service;
import org.wantsome.dao.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private long idNext = 1L;

    private List<Employee> listEmployees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employee.setId(idNext++);
        listEmployees.add(employee);
    }

    public List<Employee> getEmployees(){return listEmployees;}
}
