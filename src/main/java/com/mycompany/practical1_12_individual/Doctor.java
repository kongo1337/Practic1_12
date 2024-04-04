/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_12_individual;

import java.io.Serializable;

/**
 *
 * @author KonGo
 */



public class Doctor implements Serializable {
    private String name;
    private int age;
    private String specialization;
    private String hospital;
    private int salary;

    public Doctor(String name, int age, String specialization, String hospital, int salary) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.hospital = hospital;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
