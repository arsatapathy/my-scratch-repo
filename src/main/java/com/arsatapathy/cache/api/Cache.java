package com.arsatapathy.cache.api;

import java.util.Optional;

public interface Cache {
    Optional<String> get(String key);
    void put(String key, String value);
}
