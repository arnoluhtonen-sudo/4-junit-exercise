package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DayOfYearTest {


    @Test
    void firstDayofYearisDayOne() {
        int paivanumero = DayOfYear.dayOfYear(1, 1, 2020);
        assertEquals(1, paivanumero);
    }
    @Test
    void lastDayOfNormalYear() {
        int paivanumero = DayOfYear.dayOfYear(12, 31, 2019);
        assertEquals(365, paivanumero);
    }
    @Test
    void lastDayOfLeapYear(){
        int paivanumero = DayOfYear.dayOfYear(12, 31, 2020);
        assertEquals(366, paivanumero);
    }
    @Test
    void firstDayOfFebruary(){
        int paivanumero = DayOfYear.dayOfYear(2, 28, 2020);
        assertEquals(32, paivanumero);

    }
    @Test 
    void firstDayOfNormalMarch(){
        int paivanumero = DayOfYear.dayOfYear(3, 1, 2019);
        assertEquals(60, paivanumero);
    }
    @Test 
    void firstDayOfLeapYearMarch(){
        int paivanumero = DayOfYear.dayOfYear(3, 1, 2020);
        assertEquals(61, paivanumero);

    }
    @Test
    void middleOfYear(){
        int paivanumero = DayOfYear.dayOfYear(6, 15, 2020);
        assertNotEquals(167, paivanumero);
    }
    @Test
    void invalidDateThrowsException(){
        assertThrows(IllegalArgumentException.class,
            () ->
        DayOfYear.dayOfYear(2, 30, 2020));
    }

}
