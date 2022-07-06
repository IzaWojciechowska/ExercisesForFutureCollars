package com.futurecollars;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @org.junit.jupiter.api.Test
    void shouldCheckAgeIsItAdultOrNot() {
        // given
        int givenAge = 18;

        // when
        boolean isAdultOrNot = AgeValidator.isAdult(givenAge);

        // then
        Assertions.assertEquals(true, isAdultOrNot);
    }
}