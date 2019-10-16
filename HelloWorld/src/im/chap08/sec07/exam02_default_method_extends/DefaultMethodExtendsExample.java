package im.chap08.sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() { /*���๮*/ }
			@Override
			public void method3() { /*���๮*/ }
		};
		
		ci1.method1();
		ci1.method2();  //ParentInterface�� method2() ȣ��
		ci1.method3();
		
		//-------------------------------------------------------------
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() { /*���๮*/ }
			@Override
			public void method3() { /*���๮*/ }
		};
		
		ci2.method1();
		ci2.method2();  //ChildInterface2�� method2() ȣ��
		ci2.method3();		
		
		//-------------------------------------------------------------
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() { /*���๮*/ }
			@Override
			public void method2() { /*���๮*/ }
			@Override
			public void method3() { /*���๮*/ }
		};
		
		ci3.method1();
		ci3.method2();  //ChildInterface3 ���� ��ü�� method2() ȣ��
		ci3.method3();				
	}
}
