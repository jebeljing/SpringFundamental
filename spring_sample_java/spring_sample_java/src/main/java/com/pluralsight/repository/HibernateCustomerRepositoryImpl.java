package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingshanyin on 7/3/17.
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {

        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Bryan");
        customer.setLastname("Hansen");

        customers.add(customer);
        return customers;
    }
}
