package im.chap07.sec05.exam02_final_method;

public class Car {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	}		
	
	//final �޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}

