package com.arsatapathy.generics.wildcard;

import com.arsatapathy.generics.wildcard.api.MyPrinter;
import com.arsatapathy.generics.wildcard.impl.MyPrinterImpl;
import com.arsatapathy.generics.wildcard.model.Manager;
import com.arsatapathy.generics.wildcard.model.TeamLead;

import java.util.List;

public class WildCardTestApp {
    public static void main(String[] args) {
        MyPrinter printer = new MyPrinterImpl();

        Manager manager = new Manager();

        manager.setEmpId(123);
        manager.setEmpAddress("abc");
        manager.setNumberOfRepertories(10);

        printer.print(List.of(manager));

        TeamLead teamLead = new TeamLead();

        teamLead.setEmpId(234);
        teamLead.setEmpAddress("xyz");
        teamLead.setTeam("ABC");

        printer.print(List.of(teamLead));
    }
}
