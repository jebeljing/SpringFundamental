package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by jingshanyin on 7/3/17.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
