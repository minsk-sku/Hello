package com.yedam.example;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	
	public boolean roll() {
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
