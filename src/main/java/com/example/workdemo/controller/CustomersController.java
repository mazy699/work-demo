package com.example.workdemo.controller;

import com.example.workdemo.entity.Customers;
import com.example.workdemo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    CustomersService customersService;

    @GetMapping("/getAll")
    public List<Customers> getAllCustomers(){
        List<Customers> customersList = customersService.getAllCustomers();
        return customersList;
    }
    @GetMapping("/getByCustomerName/{customerName}")
    public Customers getByCustomerName(@PathVariable String customerName){
        Customers customers = customersService.getByCustomerName(customerName);
        return customers;
    }
    @GetMapping("/getByCustomerNumber/{customerNumber}")
    public Customers getByCustomerNumber(@PathVariable Integer customerNumber){
        Customers customers = customersService.getByCustomerNumber(customerNumber);
        return customers;
    }
}
