package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void canAdd() {
        // given
        Calc calc = new Calc();

        //when
        int result = calc.add(2,5);
        int result2 = calc.add(-3,5);
        int result3 = calc.add(4,-5);


        //then
        assertAll( () -> assertEquals(7, result),
                () -> assertEquals(2, result2),
                () -> assertEquals(-1, result3)
        );
    }

}