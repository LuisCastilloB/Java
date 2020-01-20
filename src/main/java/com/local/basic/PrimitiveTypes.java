package com.local.basic;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        
        integerTypes();
        integerBaseTypes();
        floatTypes();
        charTypes();
        booleanTypes();
        conversionTypes();
    }
    
    public static void  conversionTypes() {
        
        int yearsOld = Integer.parseInt("20");
        System.out.println("yearsOld : "+yearsOld+"\n");
        
        double piValue = Double.parseDouble("3.1416");
        System.out.println("yearsOld : "+piValue+"\n");
        
        char c = "Hello".charAt(0);
        System.out.println("Character : "+c+"\n");
        
        String yearsOldS = String.valueOf(20); //String.valueOf(false); String.valueOf(15F);
        System.out.println("String : "+yearsOldS+"\n");
        
        //Casting! This can lose information
        short s = 128;
        byte b = (byte) s;
        System.out.println("Byte : "+b+"\n");

        
    }
    
    public static void booleanTypes() {
        
        boolean booleanVar = true;
        boolean otherBooleanVar =  5 > 10;
        System.out.println("Boolean true: "+Boolean.TRUE);
        System.out.println("Boolean false: "+Boolean.FALSE);
        
        if (otherBooleanVar) {
            System.out.println("It is true \n");
        } else {
            System.out.println("It is false\n");
        }
    }
    
    public static void charTypes() {
        
        char charValue = '!';
        char charUnicodeVal = '\u0021';
        char charDecimalVal = 33;
        System.out.println(Character.SIZE);
        System.out.println(Character.BYTES);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println("Character: " +charValue+" - " +charUnicodeVal+ " - "+charDecimalVal+"\n");
    }
    
    public static void floatTypes() {
        
        float floatVar = 1000.10F;
        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("Float:" + floatVar+"\n");
        
        double doubleVar = 100.15; //100.15D;
        System.out.println(Double.SIZE);
        System.out.println(Double.BYTES);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("Double:" + doubleVar+"\n");
    }
    
    /**
     * For integer 10, in hexa, octa and binary integers
     */
    public static void integerBaseTypes() {
        
        int octalNumber = 012;
        System.out.println("Octal number: "+octalNumber+"\n");
        
        int hexadecimalNumber = 0xA;
        System.out.println("Hexadecimal number:" +hexadecimalNumber+"\n");
        
        int binaryNumber = 0b1010;
        System.out.println("Binary number:" +binaryNumber+"\n");
    }
    
    
    /**
     * Integer types
     */
    public static void integerTypes() {
        
        byte byteVar = 127;
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Byte: "+byteVar+" \n");
        
        short shortVar = 32767;
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("Short: "+shortVar+"\n");
        
        int intVar = 2147483647;
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Integer: "+intVar+"\n");
        
        long longVar = 9223372036854775807L;
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("Long: "+longVar+"\n");
    }
    
            
}
