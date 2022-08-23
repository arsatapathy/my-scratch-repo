package com.arsatapathy.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class TestGson {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();
        companies.add("Google");
        companies.add("Facebook");
        companies.add("Crunchify");
        companies.add("Twitter");
        companies.add("Snapchat");
        companies.add("Microsoft");
        companies.add("ashish \"ranjan\" satapathy");
        System.out.println("Raw ArrayList ===> " + companies);
        // Use this builder to construct a Gson instance when you need to set configuration options other than the default.
        GsonBuilder gsonBuilder = new GsonBuilder();

        // This is the main class for using Gson. Gson is typically used by first constructing a Gson instance and then invoking toJson(Object) or fromJson(String, Class) methods on it.
        // Gson instances are Thread-safe so you can reuse them freely across multiple threads.
        Gson gson = gsonBuilder.create();
        String JSONObject = gson.toJson(companies);
        System.out.println("Converted JSONObject ==> " + JSONObject);

        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(companies);

        System.out.println("Pretty JSONObject ==> " + prettyJson);

        ArrayList<String> listOfCompanies = gson.fromJson(JSONObject, new TypeToken<List<String>>(){}.getType());

        System.out.println(listOfCompanies);
    }
}
