package com.arsatapathy.delegate.impl;

import com.arsatapathy.delegate.api.ProductQueryService;
import com.arsatapathy.delegate.model.Product;
import com.arsatapathy.delegate.stub.ProductStub;
import com.google.inject.Inject;

import java.util.Optional;

public class StubBackedProductQueryService implements ProductQueryService {
    private final ProductStub productStub;

    @Inject
    public StubBackedProductQueryService(ProductStub productStub) {
        this.productStub = productStub;
    }

    @Override
    public Optional<Product> getProductWithId(String id) {
        return productStub.getProduct(id);
    }
}
