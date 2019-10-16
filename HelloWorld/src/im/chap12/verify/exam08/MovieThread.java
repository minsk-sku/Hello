package im.chap12.verify.exam08;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			if(this.isInterrupted()) {
				break;
			}
		}
	}
}
