package com.arsatapathy.delegate;

import com.arsatapathy.delegate.client.Client;
import com.arsatapathy.delegate.client.DuplicateClient;
import com.arsatapathy.delegate.module.ProductModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ProductModule());

        Client client = injector.getInstance(Client.class);
        DuplicateClient duplicateClient = injector.getInstance(DuplicateClient.class);

        client.displayProduct("1");
        client.displayProduct("1");
        client.displayProduct("1");
        client.displayProduct("1");
        duplicateClient.displayProduct("1");
        duplicateClient.displayProduct("1");
        duplicateClient.displayProduct("1");
    }
}
