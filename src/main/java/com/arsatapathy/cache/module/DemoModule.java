package com.arsatapathy.cache.module;

import com.arsatapathy.cache.model.Customer;
import com.arsatapathy.cache.api.CustomerQueryService;
import com.arsatapathy.cache.impl.CustomerQueryServiceImpl;
import com.arsatapathy.cache.repo.api.CustomerRepo;
import com.arsatapathy.cache.repo.impl.CustomerRepoImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

public class DemoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CustomerQueryService.class).to(CustomerQueryServiceImpl.class);
        bind(CustomerRepo.class).to(CustomerRepoImpl.class);
    }

    @Provides
    @Singleton
    @Named("cache")
    public Map<String, Customer> getCache() {
        return new HashMap<>();
    }
}
