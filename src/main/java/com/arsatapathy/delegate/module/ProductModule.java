package com.arsatapathy.delegate.module;

import com.arsatapathy.delegate.api.ProductQueryService;
import com.arsatapathy.delegate.impl.CacheBackedProductQueryService;
import com.arsatapathy.delegate.impl.StubBackedProductQueryService;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class ProductModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ProductQueryService.class).to(StubBackedProductQueryService.class);

        try {
            bind(ProductQueryService.class).annotatedWith(Names.named("cache-query-service")).toConstructor(CacheBackedProductQueryService.class.getConstructor(ProductQueryService.class)).in(Singleton.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
