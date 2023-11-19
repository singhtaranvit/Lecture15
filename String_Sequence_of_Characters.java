package com.Lecture15;

public class String_Sequence_of_Characters {

	public static void main(String[] args) {
		char[] c = {'S','e','l','e','n','i','u','m'};
		String S1 = new String(c);
		System.out.println(S1);
		String S2 = "Selenium";
		System.out.println(S2);
		String S3 = new String("Selenium");
		System.out.println(S3);
		String S4 = "!@#$%^&*()123qwerty";
		System.out.println(S4);
		char[] spl = {'!','@','#','$','%','^','&','*','(',')','1','2','3','q','w','e','r','t','y'};
		System.out.println(spl);
		String C1 = new String(spl);
		System.out.println(C1);
		
	}
}
