package com.arsatapathy.cache.dummy.impl;

import com.arsatapathy.cache.api.CustomerQueryService;
import com.arsatapathy.cache.dummy.api.MyCacheDummy;
import com.google.inject.Inject;

public class MyCacheDummyImpl implements MyCacheDummy {
    private final CustomerQueryService customerQueryService;

    @Inject
    public MyCacheDummyImpl(CustomerQueryService customerQueryService) {
        this.customerQueryService = customerQueryService;
    }

    @Override
    public CustomerQueryService getInstance() {
        return customerQueryService;
    }
}
