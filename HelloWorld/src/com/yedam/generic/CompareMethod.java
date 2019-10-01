package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result1 = Util.compareValue(p1, p2);
		if (result1) {
			System.out.println("논리적으로 동일");

		} else {
			System.out.println("논리적으로 다름");
		}
		Integer intV1 = Util.compare(t1, t2);
		System.out.println(intV1);
	}

}
