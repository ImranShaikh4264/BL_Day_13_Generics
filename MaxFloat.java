package com.bridgelab.generics;

public class MaxFloat {
	public static Float testMax(Float value1, Float value2, Float value3) {
		Float max = value1;

		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println(" Maximum Float is " + testMax(45.75f, 35.7f, 50.74f));
	}

}
