package com.example.workdemo.service;

import com.example.workdemo.entity.Customers;

import java.util.List;

public interface CustomersService {
    List<Customers> getAllCustomers();

    Customers getByCustomerName(String customerName);

    Customers getByCustomerNumber(Integer customerNumber);
}
