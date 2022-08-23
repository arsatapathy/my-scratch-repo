package com.arsatapathy.cache.module;

import com.arsatapathy.cache.api.Cache;
import com.arsatapathy.cache.impl.CacheImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

public class DemoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Cache.class).to(CacheImpl.class);
    }

    @Provides
    @Singleton
    @Named("cache")
    public Map<String, String> getCache() {
        return new HashMap<>();
    }
}
