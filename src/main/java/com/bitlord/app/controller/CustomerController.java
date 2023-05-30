package com.bitlord.app.controller;

import com.bitlord.app.entity.Customer;

import com.bitlord.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/customers" )
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping( "/all" )/*GET,POST,PUT,DELETE*/
    public String allCustomers(Model model){

        List<Customer> list = customerService.findAllCustomers();
        model.addAttribute("customers",list);

        return "all-customers";
    }


    @GetMapping( "/new-customer-form" )/*GET,POST,PUT,DELETE*/
    public String newCustomerFormLoader(){

        List<Customer> list = customerService.findAllCustomers();

        return "new-customer-form";
    }


}
