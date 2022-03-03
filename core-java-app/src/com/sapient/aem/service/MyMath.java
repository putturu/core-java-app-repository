package com.sapient.aem.service;
/**
 * 
 * @author Srini
 * This is a utility class containing static methods that perform
 * mathematical operations
 *
 */
public class MyMath {
	/**
	 * 
	 * @param n receives an integer value
	 * @return returns its factorial, if given number is negative
	 * return -1; if given number is 0 return 1
	 */
	public static long factorial(int n) {
		if(n<0) {
			return -1;
		}
		long fact=1;
		while(n>0) {						
			fact *= n--;
		}
		return fact;
	}

	/**
	 * 
	 * @param n receives an integer value
	 * @return return true if the given number is prime number else
	 * returns false.
	 * A number is a prime number if it is divisible by 1 and by itself.
	 */
	public static boolean isPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPerfectNumber(int n) {
		int s = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0){
				s = s+i;
			}
		}
		System.out.println(s);
		if(s == n){
			return true;
		}
		else {
			return false;
		}
	}
	public static long sumOfPrimes(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static boolean isArmstrongNumber(int n) {
		int t = n;
		int len = len(n);
		int sum =0;
		while(n>0) {
			sum = sum + (int)Math.pow(n%10, len);
			n = n/10;
		}
		if(sum == t )return true;
	
		return false;
	}
	 public static int reverseNumber(int n) {
		 int rev = 0;
		 while(n>0) {
			 int digit = n%10;
			 rev = rev*10+digit;
			 n = n/10;
		 }
		 return rev;
	 }
	 public static int len(int n) {
		 int l=0;
		 while(n>0) {
			 l++;
			 n=n/10;
		 }
		return l;
	 }
	 public static int binaryToDecimal(int n) {
		 int b=0;
		 int e = 1;
		 while(n>0) {
			 int bit = n%2;
			 b=(bit*e)+b;
			 e = e*10;
			 n = n/2;
		 }
		 return b;
	 }
	 public static int decimalToBinary(int n) {
		 int d = 0;
		 int e = 1;
		 while(n>0) {
			 int b = n%10;
			 d = d+b*e;
			 e=e*2;
			 n=n/10;
		 }
		 return d;
	 }
	 public static int getSumOfNfibos(int n) {
		 int sum = 0;
		 int a=0,b=1,c;
		 while(a<=n) {
			 sum = sum + a;
			 c=a+b;
			 a=b;
			 b=c;
		 }
		return sum;
	 }
	 public static boolean isPalindromeNumber(int n) {
		 if(n==reverseNumber(n)) return true;
		 return false;
	 }

}
