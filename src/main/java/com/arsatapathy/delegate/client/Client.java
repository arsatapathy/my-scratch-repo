package com.arsatapathy.delegate.client;

import com.arsatapathy.delegate.api.ProductQueryService;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Client {
    private final ProductQueryService productQueryService;

    @Inject
    public Client(@Named("cache-query-service") ProductQueryService productQueryService) {
        this.productQueryService = productQueryService;
    }

    public void displayProduct(String id) {
        System.out.println(productQueryService.getProductWithId(id));
    }

}
