package com.arsatapathy.generics.wildcard.model;

public class Employee {
    private int empId;
    private String empAddress;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
