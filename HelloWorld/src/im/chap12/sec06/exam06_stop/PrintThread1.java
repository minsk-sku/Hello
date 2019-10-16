package im.chap12.sec06.exam06_stop;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
	  this.stop = stop;
	}
	
	public void run() {	
		while(!stop) {
			System.out.println("���� ��");
		}	
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

