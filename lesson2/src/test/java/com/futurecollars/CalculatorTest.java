package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        // given
        int firstValue = 1;
        int secondValue = 1;

        // when
        int resultOfSum = Calculator.sum(firstValue, secondValue);

        // then
        Assertions.assertEquals(2, resultOfSum);
    }

    @Test
    void shouldSubstractSecondValuefromFirst() {
        // given
        int firstValue = 3;
        int secondValue = 1;

        // when
        int resultOfSubstraction = Calculator.substract(firstValue, secondValue);

        // then
        Assertions.assertEquals(2, resultOfSubstraction);
    }

    @Test
    void shouldMultiplyTwoValues() {
        // given
        int firstValue = 2;
        int secondValue = 2;

        // when
        int resultOfMultiplication = Calculator.multiply(firstValue, secondValue);

        // then
        Assertions.assertEquals(4, resultOfMultiplication);
    }

    @Test
    void shouldDivideTwoValues() {
        // given
        int firstValue = 6;
        int secondValue = 2;

        // when
        int resultOfDivision = Calculator.division(firstValue, secondValue);

        // then
        Assertions.assertEquals(3, resultOfDivision);
    }
}