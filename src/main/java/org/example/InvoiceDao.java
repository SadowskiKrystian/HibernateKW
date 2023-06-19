package org.example;

import org.hibernate.Session;

import java.util.List;

public class InvoiceDao {
    public List<Invoice> findAll(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String query = "from Invoice ";
            return session.createQuery(query, Invoice.class).getResultList();
        }
    }
}
