package com.bridgelab.generics;

public class MaxString {
	public static String testMax(String string1, String string2, String string3) {
		
		String max = string1;
		String maximum = null;

		if (string2.compareTo(max) > 0) {
			max = string2;
		}
		if (string3.compareTo(max) > 0) {
			max = string3;
		}
		return max;
	
	}

	public static void main(String[] args) {
		System.out.println(" Maximum String is " + testMax("Apple", "Peach", "Banana"));
	}

}
