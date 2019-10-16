package im.chap12.sec02.exam02_threadname;

public class ThreadB extends Thread {	
	public void run() {		
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "�� ����� ����");
		}
	}
}

