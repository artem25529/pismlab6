package com.es.dao;

import com.es.model.CustomerDetails;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Singleton
public class CustomerDao {
    @PersistenceContext(unitName = "AppPU")
    private EntityManager entityManager;
    
    @PostConstruct
    private  void init() {
        entityManager.persist(new CustomerDetails("Hetfield", "baker str", "nyc", "+12343423434", "Minsk", "test@mail.ru", 1));
        entityManager.persist(new CustomerDetails("Hammet", "addr1", "ad2", "+345456", "Minsk", "Het@mail.ru", 2));
        entityManager.persist(new CustomerDetails("Ulrich", "addr2", "nyc", "+12343423434", "Minsk", "met@mail.ru", 3));
        entityManager.persist(new CustomerDetails("Sykes", "addr3", "add5", "+564566", "Brest", "sdf@mail.ru", 4));
        entityManager.persist(new CustomerDetails("Fish", "addr5", "nyc", "+12343423434", "Minsk", "342@mail.ru", 5));
        entityManager.persist(new CustomerDetails("Mastein", "baker str", "nyc", "+34543", "Gomel", "dfg@mail.ru", 6));

    }

    @SuppressWarnings("unchecked")
    public List<CustomerDetails> findAll() {
        return entityManager.createQuery("FROM CustomerDetails").getResultList();
    }

    public CustomerDetails findById(Long id) {
        return entityManager.find(CustomerDetails.class, id);
    }
}
