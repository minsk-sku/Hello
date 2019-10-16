package im.chap06.sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}
}
