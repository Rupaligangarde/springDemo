package com.example.demo;

import com.example.demo.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService1 = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService1);

        CustomerService customerService2 = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService2);


        System.out.println(customerService1.findAll().get(0).getFirstName());
        System.out.println(customerService1.findAll().get(0).getLastName());
    }
}
