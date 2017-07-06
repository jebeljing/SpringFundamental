package com.pluralsight.com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by jingshanyin on 7/3/17.
 */
public interface CustomerService {
    List<Customer> findAll();
}
