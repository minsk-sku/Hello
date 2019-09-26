package com.yedam.example2;

import com.yedam.example.HankookTire;
import com.yedam.example.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("hankookTire");
				car.tires[0] = new HankookTire("frontLeft", 15);
				break;
			case 2:
				System.out.println("kumhoTire");
				car.tires[1] = new KumhoTire("frontRight", 17);
				break;
			case 3:
				System.out.println("hankookTire");
				car.tires[2] = new HankookTire("backLeft", 10);
				break;
			case 4:
				System.out.println("kumhoTire");
				car.tires[3] = new KumhoTire("backRight", 15);
				break;

			}
			System.out.println("-----------------------");
		}
	}

}
