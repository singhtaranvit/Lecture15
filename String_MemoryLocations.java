package com.Lecture15;

public class String_MemoryLocations {

	public static void main(String[] args) {
		String S1 =new String();
		System.out.println(S1);
		//Whenever we create an object using new keyword, the object is stored inside the Heap Memory
		
		String S2 = new String("Java");
		System.out.println(S2);
		// One object will be created in Heap Memory because of new keyword
		//One object will be created in SCP/SLP because we passed constructor Java
		String S3 = new String("Python");
		System.out.println(S3);
		// One object will be created in Heap Memory because of new keyword
				//One object will be created in SCP/SLP because we passed constructor Java
		String S4 = "abc";
		System.out.println(S4);
		//Only one object will be created in SCP/SLP.
		String S5 = "Java";
		System.out.println(S5);
		//Here no object will be created, only reference will be changed to S5 , instead of JVM
	}
}
