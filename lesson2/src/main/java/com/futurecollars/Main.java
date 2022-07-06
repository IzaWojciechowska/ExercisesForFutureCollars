package com.futurecollars;

public class Main {
    public static void main(String[] args) {

        int number = 3;

        boolean isNumberEven = NumberValidator.isEven(number);
        if (isNumberEven == true) {
            System.out.println("Number " + number + " is even.");
        } else
            System.out.println("Number " + number + " is not even.");

        boolean isNumberOdd = NumberValidator.isOdd(number);
        if (isNumberOdd == true) {
            System.out.println("Number " + number + " is odd.");
        } else
            System.out.println("Number " + number + " is not odd.");

    }
}
