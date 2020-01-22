
package com.local.basic;


public class Iterators {
    
    public static void main(String args[]) {
        iFor();
        iForEach();
        iWhile();
        iDoWile();
    }
    
    public static void iFor() {
        
        int a = 0;
        ini:
        for (int i=0; i<=10; i++) {
            a += i;
            if (i == 9) {
                continue ini;
            }
        }
        System.out.println("Valor de la iteracion for: "+a+"\n");
    }
    
    public static void iForEach() {
        
        int [] numbers = {100, 200, 300, 400, 500};
        int a = 0;
        for(int number : numbers){
            a += number;
        }
        System.out.println("Valor de la iteracion forEach: "+a+"\n");

        
    }
    
    public static void iWhile() {
        
        int i = 0;
        int a = 0;
        while (i <= 10) {
            a += i;
            if (i == 9) {
                break;
            }
            i++;
        }
        System.out.println("Valor de la iteracion while: "+a+"\n");
    }
    
    public static void iDoWile() {
        
        int i = 0;
        int a = 0;
        do {
            a += i;
            i++;
        } while (i <= 10);
        System.out.println("Valor de la iteracion do while: "+a+"\n");
    }
}
