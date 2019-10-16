package im.chap07.sec07.exam03_field_polymorphism;

public class Tire {
	//�ʵ�
	public int maxRotation;     			//�ִ� ȸ����(�ִ� ����)
	public int accumulatedRotation;		//���� ȸ����
	public String location;       			//Ÿ�̾��� ��ġ

	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}

