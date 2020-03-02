//package com.im;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class FirstTest {
//    @Test
//    void canary(){
//        assertTrue(true);
//    }
//
//}


package com.im;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    First first;

    @BeforeEach
    void setup(){
        this.first = new First();
    }



    

    @Test
    void replaceSubString() {

        //given
        String mainString = "Hello This is John from cave of Programming";
        String substring = "Hello";
        String replacementSubstring= "Hi";
        String expectedString = "Hi This is John from cave of Programming";

        //When

        String actualString = first.replaceSubString(mainString,substring,replacementSubstring);

        //Then

        assertEquals(expectedString,actualString);

    }

    @Test
    void filterEvenElements() {

        //Given
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        int[] expectedList = {1,3};
        //When
        int[] actualEvenNoList = this.first.filterEvenElements(list).stream().mapToInt(Integer::intValue).toArray();

        //Then

        Assert.assertArrayEquals(expectedList,actualEvenNoList);


    }


    @Test
    void calculateAverage() {

        //Given
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        list.add(new BigDecimal(1.0));
        list.add(new BigDecimal(10.0));
        list.add(new BigDecimal(100.0));
        list.add(new BigDecimal(150.0));


        //When
            BigDecimal expectedAverage = new BigDecimal(65.25);
            BigDecimal average = this.first.calculateAverage(list);

        //Then
            assertEquals(expectedAverage,average);


    }

    @Test
    void isPallindrome() {

        //Given

        String mainString = "MADAM";

        // when
        boolean expectedResult = this.first.isPallindrome(mainString);

        //then
        assertTrue(expectedResult);
    }
}

