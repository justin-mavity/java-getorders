package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();

    List<Customer> findByCustomerName(String custname);

    Customer findByCustomerId(long id);
}
