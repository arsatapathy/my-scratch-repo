package com.arsatapathy.generics.wildcard.api;

import com.arsatapathy.generics.wildcard.model.Employee;

import java.util.List;

public interface MyPrinter {
    void print(List<? extends Employee> list) ;
}
