package im.chap08.sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		//vehicle.checkFare(); (x)

		Bus bus = (Bus) vehicle;  //����Ÿ�Ժ�ȯ

		bus.run();
		bus.checkFare();
	}
}
