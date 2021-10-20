package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OutputTests {

	@Test
	public void givenOneGetOne() {
		//Given: I am a user
		//When: I enter the integer 1
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(1);
		//Then: I get back the string "1"
		assertEquals("1", result);
	}

	@Test
	public void givenTwoGetOneTwo() {
		//Given: I am a user
		//When: I enter the integer 2
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(2);
		//Then: I get back the string "1, 2"
		assertEquals("1, 2", result);
	}

	@Test
	public void givenThreeGetOneTwoFizz() {
		//Given: I am a user
		//When: I enter the integer 3
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(3);
		//Then: I get back the string "1, 2, Fizz"
		assertEquals("1, 2, Fizz", result);

	}

	@Test
	public void givenFiveGetOneTwoFizzFourBuzz() {
		//Given: I am a user
		//When: I enter the integer 5
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(5);
		//Then: I get back the string "1, 2, Fizz, 4, Buzz"
		assertEquals("1, 2, Fizz, 4, Buzz", result);

	}

	@Test
	public void givenSixGetOneTwoFizzFourBuzzFizz() {
		//Given: I am a user
		//When: I enter the integer 6
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(6);
		//Then: I get back the string "1, 2, Fizz, 4, Buzz, Fizz"
		assertEquals("1, 2, Fizz, 4, Buzz, Fizz", result);

	}

	@Test
	public void givenTenGetStringEndingInBuzz() {
		//Given: I am a user
		//When: I enter the integer 10
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(10);
		//Then: I get back the string "Buzz"
		assertEquals(true, result.endsWith("Buzz"));

	}

	@Test
	public void givenFifteenGetStringEndingInFizzBuzz() {
		//Given: I am a user
		//When: I enter the integer 15
		IGetFizzBuzz IGBF = new GetFizzBuzz();
		String result = IGBF.getResult(15);
		//Then: I get back the string "Buzz"
		assertEquals(true, result.endsWith("FizzBuzz"));

	}

}

//Given: I am a user
//When: I enter the number 1
//Then: ConvertString.getResult() will be called one time

//Given: I am a user
//When: I enter the number 1
//Then: RangeVal.getResult() will be called one time

//Given: I am a user
//When: I enter the number 1
//Then: GetFizzBuzz.getResult() will be called one time

//Given: I am a user
//When: I enter the number 0
//Then: ConvertString.getResult() will be called one time

//Given: I am a user
//When: I enter the number 0
//Then: RangeVal.getResult() will be called one time

//Given: I am a user
//When: I enter the number 0
//Then: GetFizzBuzz.getResult() will be called zero times

//Given: I am a user
//When: I enter the word "five"
//Then: ConvertString.getResult() will be called one time

//Given: I am a user
//When: I enter the word "five"
//Then: RangeVal.getResult() will be called zero times

//Given: I am a user
//When: I enter the word "five"
//Then: GetFizzBuzz.getResult() will be called zero times