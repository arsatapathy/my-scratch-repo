package com.arsatapathy.cache.api;

import com.arsatapathy.cache.model.Customer;

import java.util.Optional;

public interface CustomerQueryService {
    Optional<Customer> get(String customerId);
    String put(String customerId, Customer customer);
}
