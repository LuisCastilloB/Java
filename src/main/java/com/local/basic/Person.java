/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.local.basic;

/**
 *
 * @author Pc
 */
public class Person {
    String name;
    int yearsOld;

    /**
     * Constructor
     */
    
    Person() {
        this.name = "";
        this.yearsOld = 0;
    }
    
    Person (String name , int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    
    public String personInfo() {
        return getName() + " - " + getYearsOld();
    }       
}
