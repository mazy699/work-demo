package com.example.workdemo.service.impl;

import com.example.workdemo.entity.Customers;
import com.example.workdemo.entity.CustomersExample;
import com.example.workdemo.mapper.CustomersMapper;
import com.example.workdemo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    CustomersMapper customersMapper;

    @Override
    public List<Customers> getAllCustomers() {
        List<Customers> customersList = new ArrayList<>();
        CustomersExample customersExample = new CustomersExample();
        customersExample.createCriteria().getAllCriteria();
        customersList = customersMapper.selectByExample(customersExample);
        return customersList;
    }

    @Override
    public Customers getByCustomerName(String customerName) {
        Customers customers = new Customers();
        CustomersExample customersExample = new CustomersExample();
        customersExample.createCriteria().andCustomernameEqualTo(customerName);
        List<Customers> customersList = customersMapper.selectByExample(customersExample);
        if (customersList != null && customersList.size() > 0) {
            customers = customersList.get(0);
        }
        return customers;
    }

    @Override
    public Customers getByCustomerNumber(Integer customerNumber) {
        return customersMapper.selectByPrimaryKey(customerNumber);
    }
}
