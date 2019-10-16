package im.chap09.verify.exam05;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.run();
		//�͸� ��ü ���ú��� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
			new Vehicle() {
				@Override
				public void run() {
					System.out.println("Ʈ���� �޸��ϴ�.");
				}
			}
		);
	}
}
