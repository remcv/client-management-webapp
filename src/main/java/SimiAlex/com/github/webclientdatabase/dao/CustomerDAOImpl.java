package SimiAlex.com.github.webclientdatabase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import SimiAlex.com.github.webclientdatabase.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO 
{
    // fields
    @PersistenceContext
    private EntityManager entityManager;

    // methods
    @Override
    public List<Customer> getCustomers() 
    {
        List<Customer> customers = entityManager.createQuery("from Customer order by lastName").getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer aCustomer) 
    {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(aCustomer);
        
    }

    @Override
    public Customer getCustomer(int id) 
    {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void deleteCustomer(int id)
    {
        entityManager.remove(getCustomer(id));

    }

    @Override
    public List<Customer> getCustomerByLastName(String lastName) 
    {
        Query myQuery  = entityManager.createQuery("from Customer where lastName = :searchedName");
        myQuery.setParameter("searchedName", lastName);
        return myQuery.getResultList();

    }
}
