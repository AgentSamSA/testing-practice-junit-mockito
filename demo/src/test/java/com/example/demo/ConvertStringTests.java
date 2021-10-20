package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ConvertStringTests {
    
    @Test
    public void givenOneGetTrue() {
        //Given: I am a user
        //When: I enter the string "1"
        IConvertString ICS = new ConvertString();
        boolean result = ICS.getResult("1");
        //Then: I get back true
        assertEquals(true, result);
    }

    @Test
    public void givenTwoGetTrue() {
        //Given: I am a user
        //When: I enter the string "2"
        IConvertString ICS = new ConvertString();
        boolean result = ICS.getResult("2");
        //Then: I get back true
        assertEquals(true, result);
    }

    @Test
    public void givenFizzGetFalse() {
        //Given: I am a user
        //When: I enter the string "Fizz"
        IConvertString ICS = new ConvertString();
        boolean result = ICS.getResult("Fizz");
        //Then: I get back false
        assertEquals(false, result);
    }
    
    @Test
    public void givenBuzzGetFalse() {
        //Given: I am a user
        //When: I enter the string "Buzz"
        IConvertString ICS = new ConvertString();
        boolean result = ICS.getResult("Buzz");
        //Then: I get back false
        assertEquals(false, result);
    }

    @Test
    public void givenFizzBuzzGetFalse() {
        //Given: I am a user
        //When: I enter the string "FizzBuzz"
        IConvertString ICS = new ConvertString();
        boolean result = ICS.getResult("FizzBuzz");
        //Then: I get back false
        assertEquals(false, result);
    }
}
