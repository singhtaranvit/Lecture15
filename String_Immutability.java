package com.Lecture15;

public class String_Immutability {

	public static void main(String[] args) {
		String S1 = "Apple";
		S1 = S1.concat("oranges");
		System.out.println(S1);
	}

}
