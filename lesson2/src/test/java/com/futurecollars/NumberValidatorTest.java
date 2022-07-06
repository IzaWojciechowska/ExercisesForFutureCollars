package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {

    @Test
    void shouldCheckIfGivenNumberIsOdd() {

        // given
        int value = 5;

        // when
        boolean isThisNumberOdd = NumberValidator.isOdd(value);

        // then
        Assertions.assertEquals(true, isThisNumberOdd);
    }

    @Test
    void shouldCheckIfGivenNumberIsEven() {

        // given
        int value = 4;

        // when
        boolean isThisNumberEven = NumberValidator.isEven(value);

        // then
        Assertions.assertEquals(true, isThisNumberEven);
    }
}