package com.example.demo;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.HibernateCustomerRepositoryImpl;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("customerService")
    public CustomerService getCustomerService(){
        return new CustomerServiceImpl(getCustomerRepository());
    }

    @Bean("customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
}
