package org.wantsome.dao;

import java.math.BigDecimal;

public class Employee {
    private long id;
    private String name;
    private String department;
    private String email;
    private BigDecimal salary;


    public Employee(long id, String name,String department ,String email , BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.department=department;
        this.email = email;
        this.salary = salary;
    }
    public Employee(String name, String department, String email, BigDecimal salary) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
