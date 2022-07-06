package com.futurecollars;

public class NumberValidator {

    public static boolean isOdd(int value) {
        if (value % 2 != 0){
            return true;
        } else
            return false;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0){
            return true;
        } else
            return false;
    }
}
