package com.sapient.aem.ui;

import com.sapient.aem.service.MyMath;

public class MyMathDemo {

	public static void main(String[] args) {
		System.out.println("Factorial of 0 = "+ MyMath.factorial(0));
		System.out.println("Factorial of -5 = "+ MyMath.factorial(-5));
		System.out.println("Factorial of 5 = "+ MyMath.factorial(5));
		
		System.out.println(MyMath.isPrime(2));
		System.out.println(MyMath.isPrime(6));
		System.out.println(MyMath.isPerfectNumber(6));
		System.out.println(MyMath.binaryToDecimal(24));
		System.out.println(MyMath.isArmstrongNumber(22));
		System.out.println(MyMath.decimalToBinary(100));
		System.out.println(MyMath.sumOfPrimes(10));
		System.out.println(MyMath.isPalindromeNumber(1901));
	}

}
