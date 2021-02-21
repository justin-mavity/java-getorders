package com.lambdaschool.getorders.controllers;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value ="/orders", produces = {"application/json"})
    public ResponseEntity<?> findAllCustomers(){
        List<Customer> customerList = customerService.findAllCustomers();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{custid}", produces = {"application/json"})
    public ResponseEntity<?> getCustomerById(@PathVariable long custid){
        Customer c = customerService.findByCustomerId(custid);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{custname}", produces = {"application/json"})
    public ResponseEntity<?> findCustomerByName(@PathVariable String custname){
        List<Customer> customerList = customerService.findByCustomerName(custname);
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
}
