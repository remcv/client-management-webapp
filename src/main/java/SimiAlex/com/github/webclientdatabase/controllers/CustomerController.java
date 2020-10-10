package SimiAlex.com.github.webclientdatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SimiAlex.com.github.webclientdatabase.dao.CustomerDAO;
import SimiAlex.com.github.webclientdatabase.services.CustomerService;

@Controller
public class CustomerController 
{
    // fields
    private CustomerService customerService;

    // constructor
    @Autowired
    public CustomerController(CustomerService cs)
    {
        this.customerService = cs;
    }

    // methods
    @GetMapping(path = {"", "/"})
    public String listCustomers(Model theModel)
    {
        theModel.addAttribute("customerList", customerService.getCustomers());
        return "index";
    }
}
