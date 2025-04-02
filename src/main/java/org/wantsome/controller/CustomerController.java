package org.wantsome.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.dao.Customer;
import org.wantsome.dao.CustomerForm;
import org.wantsome.service.CustomerService;

@Controller
public class CustomerController {

private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer-Form")
    public String getCustomer(Model model){
        model.addAttribute("customerForm", new CustomerForm());
        return "customerList";
    }



    @PostMapping("/customer-List")
    public String showCustomer(@Valid @ModelAttribute("customerForm") CustomerForm customerForm , BindingResult bindingResult,
                               Model model){
if(bindingResult.hasErrors()){
    return "customerForm";
}

Customer customer1 = new Customer(

        customerForm.getName(),
        customerForm.getEmail(),
        customerForm.getPhone()
);
customerService.addCustomer(customer1);
        model.addAttribute("customers", customerService.getListCustomer());
        return "customerList";
    }


}
