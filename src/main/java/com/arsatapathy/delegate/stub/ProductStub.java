package com.arsatapathy.delegate.stub;

import com.arsatapathy.delegate.model.Product;

import java.util.Map;
import java.util.Optional;

public class ProductStub {
    private final Map<String, Product> products;

    public ProductStub() {
        products = Map.of(
               "1", Product.builder().serialNumber("1").name("P1").build(),
                "2", Product.builder().serialNumber("2").name("P2").build(),
                "3", Product.builder().serialNumber("3").name("P3").build(),
                "4", Product.builder().serialNumber("4").name("P4").build(),
                "5", Product.builder().serialNumber("5").name("P5").build()
        );
    }

    public Optional<Product> getProduct(String id) {
        System.out.println("Getting " + id + " from stub");
        if (products.containsKey(id)) return Optional.of(products.get(id));
        else return Optional.empty();
    }
}
