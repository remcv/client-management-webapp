package SimiAlex.com.github.webclientdatabase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
        List<Customer> customers = entityManager.createQuery("from Customer").getResultList();
        return customers;
    }
}
