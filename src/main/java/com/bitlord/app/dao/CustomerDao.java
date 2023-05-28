package com.bitlord.app.dao;

import com.bitlord.app.entity.Customer;

import java.util.List;

public interface CustomerDao {

    public List<Customer> findAllCustomers ();

}
