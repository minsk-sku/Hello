package im.chap06.sec08.exam02_return;

public class Car {
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�."); 
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�."); 
		return true;
	}
	
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return;
			}
		}
	}
}

