package com.arsatapathy.cache.impl;

import com.arsatapathy.cache.api.CustomerQueryService;
import com.arsatapathy.cache.model.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CustomerQueryServiceImpl implements CustomerQueryService {
    private final Map<String, Customer> customerCache;

    public CustomerQueryServiceImpl() {
        customerCache = new HashMap<>();
    }

    @Override
    public Optional<Customer> get(String customerId) {
        if (customerCache.containsKey(customerId)) {
            return Optional.of(customerCache.get(customerId));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String put(String customerId, Customer customer) {
        customerCache.put(customerId, customer);
        return customerId;
    }
 }
