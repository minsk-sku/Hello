package classes;

public class CarExample {
	public static void main(String[] args) {

		Car car1 = new Car();
		car1.model = "granduer";
		car1.color = "red";
		car1.price = 1000;
		car1.maxSpeed = 100;
		
		
				
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
		System.out.println(car1.maxSpeed);
				
		car1.drive();
		
		Car car2 = new Car();
		//int[] intAry = new int[5];
		Car[] carAry = new Car[2];
		//String[] strAry = null;
		
		car2.model = "sonata" ;
		car2.color = "blue";
		car2.price = 1200;
		car2.maxSpeed = 150;
		car2.drive();
		
		carAry[0] = car1;
		carAry[1] = car2;
		
		for (Car c : carAry) {
			System.out.println(c.model + " " + c.color);
		}
		

	}

}
