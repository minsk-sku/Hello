package im.chap06.sec15.exam01_annotation;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("���� ����1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}	
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���� ����3");
	}	
}
