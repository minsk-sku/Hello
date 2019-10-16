package im.chap07.sec07.exam04_array_management;

public class HankookTire extends Tire {
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
