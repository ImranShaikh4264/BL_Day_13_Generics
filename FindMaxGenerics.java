package com.bridgelab.generics;

public class FindMaxGenerics {
	public static <E extends Comparable> E testMax(E value1, E value2, E value3) {

		E max = value1;

		if (value2.compareTo(max) > 0) {
			max = value2; 
		}
		if (value3.compareTo(max) > 0) {
			max = value3; 
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		Integer maxInt = FindMaxGenerics.testMax(30, 50, 40);
		Float maxFloat = FindMaxGenerics.testMax(10.5f, 12.2f, 15.5f);
		String maxString = FindMaxGenerics.testMax("apple", "banana", "peach");
		System.out.println("\nMaximum integer among three integer is : " + maxInt);
		System.out.println("Maximum float among three float is : " + maxInt);
		System.out.println("Maximum string among three string is : " + maxInt);
	}

}
