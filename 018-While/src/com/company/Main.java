package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count < 6) {
            System.out.println("Count is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count < 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even number " + number);

            if(evenNumbersFound > 4) {
                break;
            }

        }

        System.out.println("Even Numbers Found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        return ((number % 2) == 0);
    }

}
