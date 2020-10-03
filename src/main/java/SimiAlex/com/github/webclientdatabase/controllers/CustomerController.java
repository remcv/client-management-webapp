package SimiAlex.com.github.webclientdatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SimiAlex.com.github.webclientdatabase.dao.CustomerDAO;

@Controller
public class CustomerController 
{
    // fields
    private CustomerDAO customerDAO;

    // constructor
    @Autowired
    public CustomerController(CustomerDAO cDao)
    {
        this.customerDAO = cDao;
    }

    // methods
    @RequestMapping({"", "/"})
    public String listCustomers(Model theModel)
    {
        System.out.println("--------");
        System.out.println(customerDAO.getCustomers());

        theModel.addAttribute("customerList", customerDAO.getCustomers());
        return "index";
    }
}
