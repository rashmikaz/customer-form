package org.example.dto.tm;

import com.jfoenix.controls.JFXTextField;

public class Dashboardtm {


    private String Address;


    private String Id;


    private String Name;


    private String Salary;

    public Dashboardtm() {
    }

    public Dashboardtm(String address, String id, String name, String salary) {
        Address = address;
        Id = id;
        Name = name;
        Salary = salary;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Dashboardtm{" +
                "Address='" + Address + '\'' +
                ", Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}