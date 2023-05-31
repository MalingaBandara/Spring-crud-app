package com.bitlord.app.service.impl;

import com.bitlord.app.dao.CustomerDao;
import com.bitlord.app.entity.Customer;
import com.bitlord.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/* @Component => Controller, Repository, Service */
@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerDao customerDao;


    @Override
    @Transactional
    public List<Customer> findAllCustomers() {

        return customerDao.findAllCustomers();

    }


    @Override
    @Transactional
    public void saveCustomer(Customer customer) {

        customerDao.saveCustomer( customer );

    }

    @Override
    @Transactional
    public Customer findCustomer(long id) {
        return customerDao.findCustomer(id);
    }

    @Override
    @Transactional
    public void deleteCustomer(long id) {

        customerDao.deleteCustomer(id);

    }

}
