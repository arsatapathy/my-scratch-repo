package com.arsatapathy.generics.wildcard.model;

public class Manager extends Employee {
    private long numberOfRepertories;

    public long getNumberOfRepertories() {
        return numberOfRepertories;
    }

    public void setNumberOfRepertories(long numberOfRepertories) {
        this.numberOfRepertories = numberOfRepertories;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "empId=" + this.getEmpId() +
                ", empAddress='" + this.getEmpAddress() + '\'' +
                ", numberOfRepertories=" + numberOfRepertories +
                '}';
    }
}
