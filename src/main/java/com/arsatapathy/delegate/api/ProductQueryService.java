package com.arsatapathy.delegate.api;

import com.arsatapathy.delegate.model.Product;

import java.util.Optional;

public interface ProductQueryService {
    Optional<Product> getProductWithId(String id);
}
