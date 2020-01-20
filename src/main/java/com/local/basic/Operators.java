
package com.local.basic;

public class Operators {
    
    public static void main(String args[]) {
        aritmeticOperators();
        assignmentOperators();
        logicOperators();
        relationOperators();
        contionalOperator();
        bitsLevelOperators();
    }
    
    /**
     * +,-,*,/,%
     */
    public static void aritmeticOperators() {
        
        int a = 10, b = 15;
        int value = (((a + b -15) * ((2 / 1))) % 2);
        System.out.println("Result aritmetic operations: "+value+"\n");
    }
    
    /**
     * <,>,<=, >=, !=, ==
     */
    public static void relationOperators() {
        int a = 3; int b = 4;
        String returnValue = "";
        if (a == b) {
            returnValue = "Equals";
        } else if (a < b) {
            returnValue = "a < b";
        } else if (a <=b ) {
            returnValue = "a <= b";
        } else if (a > b) {
            returnValue = "a > b";
        } else if (a >= b) {
            returnValue = " a >= b";
        } else if (a != b) {
            returnValue = "a != b";
        }
        System.out.println("Result of relation Operations: "+returnValue+"\n");
    }
    
    /**
     *&& o &, || o |, ! , ^
     */
    public static void logicOperators() {
        
        boolean b = false;
        if (!b && (1 == 1 || 1 < 2)) {
            System.out.println("Result of logic operators 1 \n");
        } else {
            System.out.println("Result of logic operators 2 \n");
        }
    }
    
    /**
     * &,|, ^, <<,>>,>>>
     */
    public static void bitsLevelOperators() {
        
    }
    
    /**
     * ++,--,=,*=,/=,%=,+=,-=, <<=, >>=, >>>=, &=, |=, ^=
     */
    public static void assignmentOperators() {
        
        int value = 10;
        value ++;
        value --;
        value *= 1;
        value += 5;
        value -= 5;
        value /= 2;
        value %= 2;
        
        value = ++value + value--; 
        
        System.out.println("Result assignament Operators: "+value+"\n");
        
    }
    
    /**
     * ?: (Ternario)
     */
    public static void contionalOperator() {
        int val = -1;
        int min = 0;
        int max = 10;
        
        boolean result = (val >= min && val <= max);
        String message = result ? "It is in range" : " It is not in range";
        
        System.out.println("Result of conditiona Operator: "+message+"\n");
    }
}
