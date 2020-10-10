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
    
}
