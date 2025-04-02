package org.wantsome.service;


import org.springframework.stereotype.Service;
import org.wantsome.dao.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private long nextID= 1L;

    private final List<Customer> listCustomer = new ArrayList<>();

    public void addCustomer(Customer customer){
        customer.setId(nextID++);
        listCustomer.add(customer);
    }

    public List<Customer> getListCustomer(){return listCustomer;}
}

