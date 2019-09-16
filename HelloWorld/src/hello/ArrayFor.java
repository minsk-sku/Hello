package hello;

import java.util.Scanner;

public class ArrayFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println("input");
			intArray[i] = sc.nextInt();
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
