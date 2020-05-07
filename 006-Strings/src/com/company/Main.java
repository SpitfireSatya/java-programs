package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myStriing is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myStriing is equal to " + myString);
        myString = myString + " \u00a9 2019";
        System.out.println("myStriing is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double myDouble = 120.47d;
        lastString = lastString + myDouble;
        System.out.println("LastString is equal to " + lastString);

    }
}
