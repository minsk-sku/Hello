package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result = Util.compareValue(p1, p2);
		if (result)
			System.out.println("논리적으로 동일");

		else
			System.out.println("논리적으로 다름");

		System.out.println("===============================================");
//			("user1","orange");
//			("user2","orange");
		Pair<String, String> p3 = new Pair<>("user1", "orange");
		Pair<String, String> p4 = new Pair<>("user2", "orange");
		result = Util.compare(p3, p4);
		if (result)
			System.out.println("논리적으로 동일");
		else
			System.out.println("논리적으로 다름");

		int a = 10, b = 20;
		int result1 = (a > b ? a++ : --b);
		System.out.println(result1 + "," + a + "," + b);
//			Util.compareValue();
//			Pair("orange", 10);
//			Pair("apple", 10);

//			Pair("orange", "good");
//			Pair("apple", "good");

		Integer intV1 = Util.compare(12.3, 2.3);
		System.out.println(intV1);
	}

}
