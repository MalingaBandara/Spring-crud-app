package com.bitlord.app.service.impl;

import com.bitlord.app.dao.CustomerDao;
import com.bitlord.app.entity.Customer;
import com.bitlord.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Component => Controller, Repository, Service */
@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerDao customerDao;


    @Override
    public List<Customer> findAllCustomers() {

        return customerDao.findAllCustomers();

    }

}
