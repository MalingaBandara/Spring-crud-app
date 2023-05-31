package com.bitlord.app.dao.impl;

import com.bitlord.app.dao.CustomerDao;
import com.bitlord.app.entity.Customer;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Customer> findAllCustomers() {

        return sessionFactory.getCurrentSession().createQuery( "FROM Customer", Customer.class ).getResultList();

    }


    @Override
    public void saveCustomer(Customer customer) {

        sessionFactory.getCurrentSession().saveOrUpdate( customer );

    }

    @Override
    public Customer findCustomer(long id) {
        return sessionFactory.getCurrentSession().find(Customer.class,id);
    }
}
