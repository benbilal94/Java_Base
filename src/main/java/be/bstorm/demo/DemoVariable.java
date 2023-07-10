package be.bstorm.demo;

import java.math.BigInteger;

public class DemoVariable {
    public static void main(String[] args) {

        String myString;
        myString = "Hello";
        String myNewString = myString + " World!";

        //sout => shortcut
        System.out.println(myNewString);

        // Différents type de variables primitifs !

        char myChar = 'C';
        byte myByte = 15;
        short myShort = 12;
        int myInt = 5;
        long myLong = 156;
        BigInteger myBigInteger = BigInteger.valueOf(1566666);
        float myFloat = 56.14F;
        double myDouble = 5.9;
        boolean myBoolean = true;

    }
}
