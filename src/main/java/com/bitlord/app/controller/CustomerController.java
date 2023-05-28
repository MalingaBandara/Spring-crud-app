package com.bitlord.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customers" )
public class CustomerController {

    @RequestMapping( "/all" )
    public String allCustomers(Model model){
        return "all-customers";
    }

}
