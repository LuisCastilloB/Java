
package com.local.basic;

public class TestPerson {
       
    public static void main(String args[]) {
        Person p1 = new Person("Alberto", 25);
        p1.name = "Luis";
        p1.yearsOld = 26;
        System.out.println("Test: "+p1.personInfo());

    }
}
