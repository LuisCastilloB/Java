
package com.local.basic;

public class ControlSentences {
    
    public static void main(String args[]) {
        ifElse();
        swicthCase();
    }
    
    public static void ifElse() {
    
        
        if (true || false) {
            // ...
        } else if (!false && true) {
            // ...
        } else {
            // ...
        }
    } 
    
    public static void swicthCase() {
        
        int val = 0;
        switch(val) {
            case 0:
                // ..
                break;
            case 1:
                // ..
                break;
            default:
                // ..
                break;
        }
    }
}
