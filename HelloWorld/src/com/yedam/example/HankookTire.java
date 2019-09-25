package com.yedam.example;

public class HankookTire extends Tire {
	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	boolean roll() {
		this.accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크***");
			return false;

		}

	}
}
