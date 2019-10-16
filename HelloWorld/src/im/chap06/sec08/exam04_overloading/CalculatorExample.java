package im.chap06.sec08.exam04_overloading;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);

		//���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
	}
}

