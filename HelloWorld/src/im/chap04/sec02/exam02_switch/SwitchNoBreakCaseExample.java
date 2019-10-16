package im.chap04.sec02.exam02_switch;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		//8<= �� < 12(8+4) ������ ���� ���
		int time = (int)(Math.random()*4) + 8; 
		System.out.println("[����ð�: " + time + " ��]");
		
		switch(time) {
			case 8:
				System.out.println("����մϴ�.");
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10:
				System.out.println("������ ���ϴ�.");
			default:
				System.out.println("�ܱ��� �����ϴ�.");
		}
	}
}
