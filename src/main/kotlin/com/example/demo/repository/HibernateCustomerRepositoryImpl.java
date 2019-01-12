package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

   @Override
   public List<Customer> findAll(){
       List<Customer> customers = new ArrayList<>();
       Customer customer = new Customer("Rupali", "Gangarde");
       customers.add(customer);
       return customers;
   }
}
