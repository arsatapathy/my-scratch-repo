package com.arsatapathy.cache.repo.impl;

import com.arsatapathy.cache.api.CustomerQueryService;
import com.arsatapathy.cache.model.Customer;
import com.arsatapathy.cache.repo.api.CustomerRepo;
import com.google.inject.Inject;

import java.util.Optional;

public class CustomerRepoImpl implements CustomerRepo {
    private final CustomerQueryService customerQueryService;

    @Inject
    public CustomerRepoImpl(CustomerQueryService customerQueryService) {
        this.customerQueryService = customerQueryService;
    }

   @Override
   public Optional<Customer> getCustomerById(String customerId) {
        return customerQueryService.get(customerId);
   }

   @Override
    public String saveCustomer(String customerId, Customer customer) {
        return customerQueryService.put(customerId, customer);
   }

}
