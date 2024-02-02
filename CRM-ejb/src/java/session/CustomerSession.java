/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package session;

import entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author meri_
 */
@Stateless
public class CustomerSession implements CustomerSessionLocal {
    @PersistenceContext
    private EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Customer> searchCustomers(String name) {
        Query q;
        if (name != null){
            q = em.createQuery("SELECT c FROM Customer c WHERE "
                    + "LOWER(c.name) LIKE :name");
            q.setParameter("name", "%" + name.toLowerCase() + "%");
        } 
        else{
            q = em.createQuery("SELECT c FROM Customer c"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        return q.getResultList();
}
