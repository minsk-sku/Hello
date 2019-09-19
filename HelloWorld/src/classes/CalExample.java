package classes;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		Scanner sc = new Scanner(System.in);
		// System.out.print("a ");
		// int a = sc.nextInt();
		// System.out.print("b ");
		// int b = sc.nextInt();

		// System.out.println("input two Num ");
		// int a, b = sc.nextInt();

		int[] ar = new int[2];
		for (int i = 0; i < ar.length; i++) {
			System.out.print("> ");
			ar[i] = sc.nextInt();

		}

		cal.execute(ar[0], ar[1]);

	}
}