package SimiAlex.com.github.webclientdatabase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SimiAlex.com.github.webclientdatabase.dao.CustomerDAO;
import SimiAlex.com.github.webclientdatabase.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService 
{
    // fields
    private CustomerDAO customerDAO;

    // constructors
    @Autowired
    public CustomerServiceImpl(CustomerDAO cdao)
    {
        this.customerDAO = cdao;
    }

    // methods
    @Override
    public List<Customer> getCustomers() 
    {
        return customerDAO.getCustomers();
    }

    @Override
    public void saveCustomer(Customer aCustomer) 
    {

        customerDAO.saveCustomer(aCustomer);
    }

    @Override
    public Customer getCustomer(int id) {
        
        return customerDAO.getCustomer(id);
    }

    @Override
    public void deleteCustomer(int id) 
    {
        customerDAO.deleteCustomer(id);
    }

    @Override
    public List<Customer> getCustomerByLastName(String lastName) 
    {
        return customerDAO.getCustomerByLastName(lastName);     
    }

}
