package com.company;

public class Main {

    public static void main(String[] args) {
        int myInt = 12345;
        byte myByte = 123;
        short myShort = 1234;

        long myLong = 50000L + (10L * (myInt + myByte + myShort));
        System.out.println(myLong);

    }
}
