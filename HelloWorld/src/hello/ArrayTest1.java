package hello;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		int a,b,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 입력");
		a = sc.nextInt();
		System.out.println("두번째");
		b = sc.nextInt();
				
		if (a>b)
			result = a;
		else
			result = b;
		result = (a > b ? a : b);
		System.out.println("더 큰 수는" + result);
		
		sc.close();
	}
}
