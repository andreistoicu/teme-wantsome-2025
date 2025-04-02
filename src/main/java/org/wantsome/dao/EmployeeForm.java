package org.wantsome.dao;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class EmployeeForm {


    @NotBlank(message = "Numele este obligatoriu")
    private String name ;

    @NotBlank(message = "Departamentul este obligatoriu")
    private String department;

    @NotBlank(message = "Email-ul este obligatoriu")
    @Email(message = "Valid email format")
    private String email;

    @NotNull(message = "Salariu este obligatoriu")
    @Positive(message = "Salariu trebuie sa fie o valoare pozitiva")
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
