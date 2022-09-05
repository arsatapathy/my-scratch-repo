package com.arsatapathy.generics.wildcard.impl;

import com.arsatapathy.generics.wildcard.api.MyPrinter;
import com.arsatapathy.generics.wildcard.model.Employee;

import java.util.List;

public class MyPrinterImpl implements MyPrinter {

    @Override
    public void print(List<? extends Employee> list) {
        list.forEach(Employee::print);
    }
}
