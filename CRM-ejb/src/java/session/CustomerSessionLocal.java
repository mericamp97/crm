/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package session;

import javax.ejb.Local;

import entity.Customer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author meri_
 */
@Local
public interface CustomerSessionLocal {
    public List<Customer> searchCustomers(String name);
}
