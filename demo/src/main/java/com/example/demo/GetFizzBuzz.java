package com.example.demo;

public class GetFizzBuzz implements IGetFizzBuzz {
	public String getResult(int num) {
		String result = "1";
		for (int i = 2; i <= num; i++) {
			if (i % 15 == 0) {
				result += ", FizzBuzz";
			} else if (i % 3 == 0) {
				result += ", Fizz";
			} else if (i % 5 == 0) {
				result += ", Buzz";
			} else {
			result += ", " + String.valueOf(i);
			}
		}
		return result;
	}
}
