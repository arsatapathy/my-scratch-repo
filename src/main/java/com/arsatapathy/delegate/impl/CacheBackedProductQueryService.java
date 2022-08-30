package com.arsatapathy.delegate.impl;

import com.arsatapathy.delegate.api.ProductQueryService;
import com.arsatapathy.delegate.model.Product;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class CacheBackedProductQueryService implements ProductQueryService {
    private final LoadingCache<String, Optional<Product>> productCache;

    public CacheBackedProductQueryService(ProductQueryService productQueryService) {
        productCache = CacheBuilder.newBuilder()
                .build(new CacheLoader<>() {
                           @Override
                           public Optional<Product> load(String id) {
                               return productQueryService.getProductWithId(id);
                           }
                       }
                );
    }

    @Override
    public Optional<Product> getProductWithId(String id) {
        try {
            return productCache.get(id);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
