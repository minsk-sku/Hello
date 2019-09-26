package com.yedam;

import com.yedam.example.Tire;

class Bus extends Vehicle {
	@Override
	void run() {
		System.out.println("Bus run");
	}
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("Taxi run");
	}
}



public class Vehicle {
	String engine;
	String handle;
	Tire tire;
	void start() {
		System.out.println("start");
	
		
		
	}
	void run() {
		System.out.println("run");
		
	}
	
	void stop() {
		System.out.println("stop");
	}
}
