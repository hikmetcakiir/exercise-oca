package com.hikmetcakir.package16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

//POJO (Plain Old Java Object)
public class Company {
    private String name;
    private List<String> employees = new ArrayList<>();

//    public Company() {    }

    public void printSorted() {
        System.out.println("companyName= " + name);
        Collections.sort(employees);
        System.out.println("sortedEmployees= "+ employees);
    }

    public void setName(String name) {
        if(name == null) {
            System.out.println("name cant be null");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String name) {
        if(Objects.isNull(name)) {
            System.out.println("cant add null employee");
            return;
        }

        employees.add(name);
    }
}
