package SimiAlex.com.github.webclientdatabase.dao;

import java.util.List;

import SimiAlex.com.github.webclientdatabase.model.Customer;

public interface CustomerDAO 
{
    public abstract List<Customer> getCustomers();   
    public abstract void saveCustomer(Customer aCustomer); 
    public abstract Customer getCustomer(int id);
    public abstract void deleteCustomer(int id);
    public abstract List<Customer> getCustomerByLastName(String lastName);

}
