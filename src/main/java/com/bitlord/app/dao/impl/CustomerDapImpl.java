package com.bitlord.app.dao.impl;

import com.bitlord.app.dao.CustomerDao;
import com.bitlord.app.entity.Customer;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDapImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Customer> findAllCustomers() {

        return sessionFactory.getCurrentSession().createQuery( "FROM Customer", Customer.class ).getResultList();

    }
}
