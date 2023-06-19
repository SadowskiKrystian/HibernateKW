package org.example;

import org.hibernate.Session;

import java.util.List;

public class CustomerDao {
    public List<Customer> findAll(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String query = "from Customer c join fetch c.address";
            return session.createQuery(query, Customer.class).getResultList();
        }
    }
}
