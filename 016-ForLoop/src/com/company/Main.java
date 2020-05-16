package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double)i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double)i)));
        }

        int count = 0;
        for (int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
            }

            if (count == 3) {
                System.out.println("Exiting For Loop");
                break;
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping... " + i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public  static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

}

