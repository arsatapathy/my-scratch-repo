package com.arsatapathy.cache;

import com.arsatapathy.cache.dummy.api.MyCacheDummy;
import com.arsatapathy.cache.model.Customer;
import com.arsatapathy.cache.module.DemoModule;
import com.arsatapathy.cache.repo.api.CustomerRepo;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Optional;

public class MyCacheApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());
        CustomerRepo customerRepo1 = injector.getInstance(CustomerRepo.class);
        CustomerRepo customerRepo2 = injector.getInstance(CustomerRepo.class);

        customerRepo1.saveCustomer("123", Customer.builder().id("123").name("ashish").build());

        Optional<Customer> customer = customerRepo2.getCustomerById("123");

        customer.ifPresentOrElse(System.out::println, () -> System.out.println("empty customer"));

        MyCacheDummy dummy = injector.getInstance(MyCacheDummy.class);

        dummy.getInstance().get("123").ifPresentOrElse(System.out::println, () -> System.out.println("empty customer"));
    }
}
