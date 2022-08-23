package com.arsatapathy.uuid;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static javax.swing.UIManager.put;

public class UuidTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();

        System.out.println();

        Map<String, String> map = new HashMap<>(){
            @Override
            public String put(String key, String value) {
                return super.put(key, "ashish");
            }

            {
                System.out.println("test it is");
                put("test", "test");
            }
        };


        map.put("test1", "test1");
        System.out.println(map.get("test"));
        System.out.println(map.get("test1"));
    }
}
