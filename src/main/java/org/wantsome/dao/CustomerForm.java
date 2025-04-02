package org.wantsome.dao;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerForm {

    @NotBlank(message = "Numele este obligatoriu")
    private String name;

    @NotBlank(message = "Emailul este obligatoriu")
    @Email(message = "Email-ul trebuie validat")
    private String email;

    @NotBlank(message = "Telefonul este obligatoriu")
    @Size(min= 9 ,max =11 , message = "Scrie un numar de telefon valid")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
