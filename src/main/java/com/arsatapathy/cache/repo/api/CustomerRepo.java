package com.arsatapathy.cache.repo.api;

import com.arsatapathy.cache.model.Customer;

import java.util.Optional;

public interface CustomerRepo {
    String saveCustomer(String id, Customer customer);
    Optional<Customer> getCustomerById(String id);
}
