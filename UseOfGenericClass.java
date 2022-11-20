package com.bridgelab.generics;

public class UseOfGenericClass<E extends Comparable<E>> {
	private E value1, value2, value3;

	public UseOfGenericClass(E value1, E value2, E value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public E testMax() {
		return UseOfGenericClass.testMax(value1, value2, value3);
	}

	
	public static <E extends Comparable<E>> E testMax(E value1, E value2, E value3) {

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
		UseOfGenericCLass<Integer> maximumNumber = new UseOfGenericCLass<>(-10, -20, -30);
		UseOfGenericCLass<Float> maximumNumber1 = new UseOfGenericCLass<>(10.5f, 15.2f, 5.2f);
		UseOfGenericCLass<String> maximumNumber2 = new UseOfGenericCLass<>("Apple", "Peach", "Banana");
		System.out.println("\nMaximum integer among three integer : " + maximumNumber.testMax());
		System.out.println("Maximum float among three float : " + maximumNumber1.testMax());
		System.out.println("Maximum string among three float : " + maximumNumber2.testMax());

	}
}
