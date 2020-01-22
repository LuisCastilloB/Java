
package com.local.basic;

public class TestPerson {
       
    public static void main(String args[]) {
        Person p1 = new Person("Alberto", 25);
        System.out.println("Person1: "+p1.personInfo());
        
        Person p2 = new Person();
        p2.name = "Luis";
        p2.yearsOld = 26;
        System.out.println("Person1: "+p2.personInfo());
        
        Person p3 = new Person();
        System.out.println("Person1: "+p3.personInfo());

    }
}
