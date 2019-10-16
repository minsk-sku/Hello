package im.chap19.sec03.exam02_byteorder;

import java.nio.ByteOrder;

public class ComputerByteOrderExample {
	public static void main(String[] args) {
		System.out.println("�ü�� ���� : "+System.getProperty("os.name"));
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ���� :"+ByteOrder.nativeOrder());
	}
}
