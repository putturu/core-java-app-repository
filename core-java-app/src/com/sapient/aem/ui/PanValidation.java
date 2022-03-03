package com.sapient.aem.ui;

public class PanValidation {
  public static void main(String args[]) {
	  System.out.println(checkPanNumber("HAA1234G"));
  }
  public static boolean checkPanNumber(String s) {
	  String p = "^[A-Z]{3}[0-9]{4}[A-Z]{1}$";
	  if(s.matches(p+"{8}")) return true;
	  
	  return false;
  }
}
