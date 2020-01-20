package com.local.basic;

import java.util.Scanner;

public class HelloWorld {
    
    public static void main(String args[]) {
        
        String regard = "Hello";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name:");
        String subject = scanner.nextLine();
        System.out.println(regard + " " + subject);
    }
}
