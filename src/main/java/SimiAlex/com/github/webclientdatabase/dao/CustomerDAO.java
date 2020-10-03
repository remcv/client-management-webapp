package SimiAlex.com.github.webclientdatabase.dao;

import java.util.List;

import SimiAlex.com.github.webclientdatabase.model.Customer;

public interface CustomerDAO 
{
    public abstract List<Customer> getCustomers();    
}
