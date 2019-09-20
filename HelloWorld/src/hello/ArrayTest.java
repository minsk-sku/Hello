package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input int type");
		int a = sc.nextInt();
		System.out.println("Next input");
		int b = sc.nextInt();
		System.out.println("Next Input");
		int c = sc.nextInt();
		int sum = a + b + c;

		System.out.println("값은 " + sum);

		
		sc.close();
		
	}
    
}
