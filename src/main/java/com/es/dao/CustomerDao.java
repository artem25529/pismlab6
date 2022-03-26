package com.es.dao;

import com.es.model.CustomerDetails;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Singleton
public class CustomerDao {
    @PersistenceContext(unitName = "AppPU")
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<CustomerDetails> findAll() {
        entityManager.persist(new CustomerDetails("Hetfield", "baker str", "nyc", "+12343423434"));
        entityManager.persist(new CustomerDetails("Hammer", "Prushinskih", "GB", "+23434545"));
        entityManager.persist(new CustomerDetails("Ulrich", "Kolasa", "Gikalo9", "+2134324"));
        entityManager.persist(new CustomerDetails("NewSted", "Melesha", "nyc", "+45345234"));
        return entityManager.createQuery("FROM CustomerDetails").getResultList();
    }

    public CustomerDetails findById(Long id) {
        return entityManager.find(CustomerDetails.class, id);
    }
}
