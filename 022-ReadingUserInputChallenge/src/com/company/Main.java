package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (count < 10) {
            System.out.println("Enter number #" + (count+1) + ": ");
            if(scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid number was entered");
            }

            scanner.nextLine();

        }

        System.out.println("The sum of input numbers is " + 10);

        scanner.close();
    }
}
