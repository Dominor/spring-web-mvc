package org.academiadecodigo.splicegirls36.controller;

import org.academiadecodigo.splicegirls36.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @RequestMapping(method = RequestMethod.GET, value = "/page1/index/vitor")
    protected String getDetail(Model model) {

        Customer customer = new Customer();
        customer.setName("bsCustomer");
        customer.setEmail("bla@bs.xyz");
        model.addAttribute("customer", customer);
        return "index";
    }
}
