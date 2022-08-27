package com.arsatapathy.cache.module;

import com.arsatapathy.cache.api.CustomerQueryService;
import com.arsatapathy.cache.dummy.api.MyCacheDummy;
import com.arsatapathy.cache.dummy.impl.MyCacheDummyImpl;
import com.arsatapathy.cache.impl.CustomerQueryServiceImpl;
import com.arsatapathy.cache.repo.api.CustomerRepo;
import com.arsatapathy.cache.repo.impl.CustomerRepoImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class DemoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CustomerRepo.class).to(CustomerRepoImpl.class);
        bind(MyCacheDummy.class).to(MyCacheDummyImpl.class);
    }

    @Provides
    @Singleton
    public CustomerQueryService customerQueryService() {
        return new CustomerQueryServiceImpl();
    }

}
