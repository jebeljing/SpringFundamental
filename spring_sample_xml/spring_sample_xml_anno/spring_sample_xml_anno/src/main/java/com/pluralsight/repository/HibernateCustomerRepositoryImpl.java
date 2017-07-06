package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingshanyin on 7/3/17.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Bryan");
        customer.setLastname("Hansen");

        customers.add(customer);
        return customers;
    }
}
