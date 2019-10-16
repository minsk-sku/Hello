package im.chap10.sec04_multi_catch;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("���� �Ű����� ���� �����ϰų� ���ڷ� ��ȯ�� �� �����ϴ�..");
		} catch(Exception e) {
			System.out.println("�˼� ���� ���� �߻�");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}

