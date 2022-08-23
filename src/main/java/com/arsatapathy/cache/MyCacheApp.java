package com.arsatapathy.cache;

import com.arsatapathy.cache.api.Cache;
import com.arsatapathy.cache.module.DemoModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MyCacheApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());

        Cache cache1 = injector.getInstance(Cache.class);
        Cache cache2 = injector.getInstance(Cache.class);

        cache1.put("key1", "value1");
        cache1.get("key1").ifPresentOrElse(System.out::println, () -> System.out.println("empty."));
        cache2.get("key1").ifPresentOrElse(System.out::println, () -> System.out.println("empty."));

    }
}
