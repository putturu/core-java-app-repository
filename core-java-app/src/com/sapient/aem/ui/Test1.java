package com.sapient.aem.ui;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(firstLetterUppercase("hello world"));
	}
	public static String firstLetterUppercase(String s) {
		String a[] = s.split(" ");
		String res = "";
		for(String k:a) {
			res += k.substring(0, 1).toUpperCase()+k.substring(1)+" ";
		}
		return res.trim();
	}

}
