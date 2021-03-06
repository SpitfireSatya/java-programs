package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("It was case 3, 4, or 5");
                System.out.println("Actually it was a "+ switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        char charSwitchValue = 'A';
        switch(charSwitchValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Value was not A, B, C, D, or E");
                break;
        }

        String stringSwitchValue = "January";
        switch(stringSwitchValue.toLowerCase()) {
            case "january":
                System.out.println("Value was January");
                break;
            case "february":
                System.out.println("Value was February");
                break;
            default:
                System.out.println("Value was not January or February");
                break;
        }

    }
}
