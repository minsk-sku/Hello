package com.yedam.example2;

import com.yedam.example.Tire;

public class Car {
	Tire[] tires = { new Tire("frontLeft", 6), new Tire("frontRight", 2), new Tire("backLeft", 3),
			new Tire("backRight", 4) };

	// Tire frontLeft = new Tire("frontLeft", 6);
	// Tire frontRight = new Tire("frontRight", 2);
	// Tire backLeft = new Tire("backLeft", 3);
	// Tire backRight = new Tire("backRight", 4);

	int run() {
		/*
		 * System.out.println("run"); if (frontLeft.roll() == false) { stop(); return 1;
		 * } if (frontRight.roll() == false) { stop(); return 2; } if (backLeft.roll()
		 * == false) { stop(); return 3; } if (backRight.roll() == false) { stop();
		 * return 4;
		 */

		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("[stop]");

	}

}
