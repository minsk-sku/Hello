package com.yedam.lambda;

@FunctionalInterface
interface MyInterface {
	int print(int a, int b);

}

class MyInterfaceClass implements MyInterface {

	@Override
	public int print(int a, int b) {

		return a + b;
	}

}

public class LambdaBasicExample {
	public static void main(String[] args) {
//		MyInterface mi=new MyInterfaceClass();
//		int result=mi.print(4, 3);
//		System.out.println(result);

		MyInterface mi = (c, d) -> {

			return c * d;

		};
		int result = mi.print(3, 5);
		System.out.println(result);

		mi = new MyInterface() {
			@Override
			public int print(int a, int b) {
				int c = 0;
				c = a - b;

				return c;

			}

		};
		result = mi.print(7, 4);
		System.out.println(result);

		mi = (c, d) -> {

			return c / d;

		};
		result = mi.print(8, 4);
		System.out.println(result);

	}

}
