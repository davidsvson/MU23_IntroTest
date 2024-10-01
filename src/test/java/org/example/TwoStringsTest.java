package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringsTest {

    @Test
    void canAdd() {
        //given
        TwoStrings twoStrings1 = new TwoStrings("David", "Per");
        TwoStrings twoStrings2 = new TwoStrings("David ", "Per");
        TwoStrings twoStrings3 = new TwoStrings("David", "123");

        //when
        String result1 = twoStrings1.add();
        String result2 = twoStrings2.add();
        String result3 = twoStrings3.add();

        //then
        assertAll(
                () -> assertEquals("DavidPer", result1),
                () -> assertEquals("David Per", result2),
                () -> assertEquals("David123", result3)
        );
    }

    @Test
    void subtract() {
        //given
        TwoStrings twoStrings1 = new TwoStrings("David", "Per");
        TwoStrings twoStrings2 = new TwoStrings("Per", "David");
        TwoStrings twoStrings3 = new TwoStrings("Susan ", "David");


        //when
        String result1 = twoStrings1.subtract();
        String result2 = twoStrings2.subtract();
        String result3 = twoStrings3.subtract();

        //then
        assertAll(
                () -> assertEquals(  "id"  ,result1),
                () -> assertEquals(  ""  ,result2),
                () -> assertEquals(  " "  ,result3)
        );


    }



}