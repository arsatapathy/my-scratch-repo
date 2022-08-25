package com.arsatapathy.cache.impl;

import com.arsatapathy.cache.model.Customer;
import com.arsatapathy.cache.api.CustomerQueryService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Map;
import java.util.Optional;

@Singleton
public class CustomerQueryServiceImpl implements CustomerQueryService {
    private final Map<String, Customer> customerCache;

    @Inject
    public CustomerQueryServiceImpl(@Named("cache") Map<String, Customer> customerCache) {
        this.customerCache = customerCache;
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
