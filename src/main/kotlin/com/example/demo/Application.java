package com.example.demo;

import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(customerService.findAll().get(0).getFirstName());
        System.out.println(customerService.findAll().get(0).getLastName());
    }
}
