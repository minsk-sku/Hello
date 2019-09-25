package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car=new Car();
		for(int i=0; i<10; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("hankookTire");
				car.frontLeft = new HankookTire("앞왼", 15);
				break;
			case 2:
				System.out.println("kumhoTire");
				car.frontRight = new KumhoTire("앞오", 17);
				break;
			case 3:
				System.out.println("hankookTire");
				car.backLeft = new HankookTire("뒤왼", 10);
				break;
			case 4:
				System.out.println("kumhoTire");
				car.backRight = new KumhoTire("뒤오", 15);
				break;
				
			}
			System.out.println("-----------------------");
		}
	}

}
