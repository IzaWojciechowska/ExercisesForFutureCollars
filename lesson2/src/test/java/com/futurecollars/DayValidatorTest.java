package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayValidatorTest {

    @Test
    void shouldReturnCorrectDayOfWeekDependsOnGivenNumber() {

        // given
        int monday = 1;
        int friday = 5;
        int weekend = 7;
        int wrongDay = 10;

        // when
        String mondayExpected = DayValidator.printDayOfWeek(monday);
        String fridayExpected = DayValidator.printDayOfWeek(friday);
        String weekendExpected = DayValidator.printDayOfWeek(weekend);
        String infoAboutWrongDayExpected = DayValidator.printDayOfWeek(wrongDay);

        // then
        Assertions.assertEquals(mondayExpected, "Monday");
        Assertions.assertEquals(fridayExpected, "Friday");
        Assertions.assertEquals(weekendExpected, "Weekend");
        Assertions.assertEquals(infoAboutWrongDayExpected, "There is no such a day");
    }
}