package SimiAlex.com.github.webclientdatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import SimiAlex.com.github.webclientdatabase.dao.CustomerDAO;
import SimiAlex.com.github.webclientdatabase.model.Customer;
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
    @GetMapping({"", "/"})
    public String listCustomers(Model theModel)
    {
        theModel.addAttribute("customerList", customerService.getCustomers());
        return "index";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel)
    {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer aCustomer)
    {
        customerService.saveCustomer(aCustomer);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel)
    {
        Customer c = customerService.getCustomer(theId);
        theModel.addAttribute("customer", c);

        return "customer-form";
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int id)
    {
        customerService.deleteCustomer(id);

        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchCustomer(Model theModel, @RequestParam("theSearchName") String name)
    {
        theModel.addAttribute("customerList", customerService.getCustomerByLastName(name)); 
        return "index";
    }
}
