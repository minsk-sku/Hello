package im.chap06.sec08.exam02_return;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);  //Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();  //Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();  //Car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {  //Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}

