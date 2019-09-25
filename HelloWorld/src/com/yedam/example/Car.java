package com.yedam.example;

public class Car {
	Tire frontLeft = new Tire("앞왼", 6);
	Tire frontRight = new Tire("앞오", 2);
	Tire backLeft = new Tire("뒤왼", 3);
	Tire backRight = new Tire("뒤오", 4);

	int run() {
		System.out.println("run");
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춤니다.]");

	}

}
