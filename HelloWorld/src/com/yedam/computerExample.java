package com.yedam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	// 부모 메소드를 재정의
	@Override
	double areaCircle(double r) {
		return Math.PI * r * r;
	}

	double areaCircle1(double r) {
		return super.areaCircle(r);
	}
}

public class computerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.areaCircle(10);
		System.out.println("result: " + com.areaCircle(10));

	}

}
