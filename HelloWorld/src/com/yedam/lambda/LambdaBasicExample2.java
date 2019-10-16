package com.yedam.lambda;

interface MyInterfaceNoArgs {
	public void method1();

}

interface MyInterfaceWithArgs {
	public void method2(int a);

}

interface MyInterfacewithReturn {
	public int method3(int a, int b);

}

public class LambdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> {
			System.out.println("No Arguments Expression");
		};
		fina.method1();

		MyInterfaceWithArgs fiwa = (num) -> {
			System.out.println("Result is " + num * 3);
		};
		fiwa.method2(5);

		MyInterfacewithReturn fiwr = (a, b) -> {
			return a + b;

		};

		
		int result = fiwr.method3(5, 10);
		System.out.println("Result is " + result);

	}

}
