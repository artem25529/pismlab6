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
        entityManager.persist(new CustomerDetails("James Hetfield", "10 Downing Street, London", "2 Baker street", "+375 (29) 232-23-23", "London", "het@mail.ru", 220004, 2, "124-33-23"));
        entityManager.persist(new CustomerDetails("Kirk Hammet", "2 Met Street, UK", "-", "+375 (29) 452-23-32", "Cardiff", "Het@mail.ru", 220404, 7, "213-43-23"));
        entityManager.persist(new CustomerDetails("Lars Ulrich", "6 Megadeth Street, London", "5 Blessthefall st", "+375 (29) 232-23-43", "Minsk", "met@mail.ru", 220034, 4, "213-64-23"));
        entityManager.persist(new CustomerDetails("Oliver Sykes", "9 Parkway Street, NYS", "-", "+375 (29) 761-34-47", "Brest", "dave@mail.ru", 220342, 2, "213-25-23"));
        entityManager.persist(new CustomerDetails("Jordan Fish", "2 Elef st, London", "-", "+375 (29) 193-65-35", "Minsk", "elef@mail.ru", 220004, 7, "213-34-23"));
        entityManager.persist(new CustomerDetails("Dave Mastein", "3 Downing Street, London", "4 Architec St", "+375 (29) 346-45-21", "Gomel", "metallica@mail.ru", 220034, 5, "563-13-23"));
        entityManager.persist(new CustomerDetails("Ron McGovney", "5 DowPick Street, London", "-", "+375 (29) 232-23-44", "London", "brings@mail.ru", 220034, 6, "345-34-34"));

    }

    @SuppressWarnings("unchecked")
    public List<CustomerDetails> findAll() {
        return entityManager.createQuery("FROM CustomerDetails").getResultList();
    }

    public CustomerDetails findById(Long id) {
        return entityManager.find(CustomerDetails.class, id);
    }
}
