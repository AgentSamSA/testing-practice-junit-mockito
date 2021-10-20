package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class RangeTests {
    
    @Test
    public void givenZeroGetFalse() {
        //Given: I am a user
        //When: I enter the integer 0
        IRangeVal IRV = new RangeVal();
        boolean result = IRV.getResult(0);
        //Then: I get back false
        assertEquals(false, result);
    }

    @Test
    public void givenOneGetTrue() {
        //Given: I am a user
        //When: I enter the integer 1
        IRangeVal IRV = new RangeVal();
        boolean result = IRV.getResult(1);
        //Then: I get back true
        assertEquals(true, result);
    }

    @Test
    public void givenThreeHundredGetTrue() {
        //Given: I am a user
        //When: I enter the integer 300
        IRangeVal IRV = new RangeVal();
        boolean result = IRV.getResult(300);
        //Then: I get back true
        assertEquals(true, result);
    }

    @Test
    public void givenThreeHundredAndOneGetFalse() {
        //Given: I am a user
        //When: I enter the integer 301
        IRangeVal IRV = new RangeVal();
        boolean result = IRV.getResult(301);
        //Then: I get back false
        assertEquals(false, result);
    }
}
