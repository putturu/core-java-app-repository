package com.sapient.aem.ui;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reshape("rabbit",'+'));
		System.out.println(reshape("rabbit",'-'));
	}
	public static String reshape(String s,char h) {
		char c[] = s.toCharArray();
		String k = "";
		for(int i=c.length-1;i>=1;i--) {
			k = k + c[i]+h;
		}
		return k+c[0];
	}

}
