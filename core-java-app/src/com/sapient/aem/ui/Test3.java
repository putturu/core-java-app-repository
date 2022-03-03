package com.sapient.aem.ui;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastLetter("hello world"));
	}
	public static String lastLetter(String s) {
		String a[] = s.split(" ");
		String last = "";
		for(String k:a) {
			last += k.substring(k.length()-1,k.length()).toUpperCase();
		}
		return last.toUpperCase();
	}

}
