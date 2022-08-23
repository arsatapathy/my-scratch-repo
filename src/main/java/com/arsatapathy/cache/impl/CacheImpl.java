package com.arsatapathy.cache.impl;

import com.arsatapathy.cache.api.Cache;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Map;
import java.util.Optional;

@Singleton
public class CacheImpl implements Cache {
    private final Map<String, String> cache;

    @Inject
    public CacheImpl(@Named("cache") Map<String, String> cache) {
        this.cache = cache;
    }

    public Optional<String> get(String key) {
        if (cache.containsKey(key)) {
            return Optional.of(cache.get(key));
        } else {
            return Optional.empty();
        }
    }

    public void put(String key, String value) {
        cache.put(key, value);
    }
 }
