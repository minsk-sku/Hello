package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Nice");
		list.add("Java");
		list.add(2, "Insert");
		int size = list.size();
		System.out.println("객체수는  " + size);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index; " + i + ">>" + list.get(i));
		}
		String returnVal = list.remove(2);
		System.out.println("return: " + returnVal);
		for (String str : list) {
			System.out.println(str);
		}

	}

}
