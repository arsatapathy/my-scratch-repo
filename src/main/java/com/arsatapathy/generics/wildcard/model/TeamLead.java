package com.arsatapathy.generics.wildcard.model;

public class TeamLead extends Employee {
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "empId=" + this.getEmpId() +
                ", empAddress='" + this.getEmpAddress() + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
