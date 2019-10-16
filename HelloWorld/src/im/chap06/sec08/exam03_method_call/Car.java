package im.chap06.sec08.exam03_method_call;

public class Car {
	//�ʵ�
	int speed;
	
	//������
	
	//�޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}	
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h)");
		}
	}	
}
