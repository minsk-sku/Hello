package com.yedam;

class Parent {
	void method1() {
		System.out.println("부모메소드1");
	}

	void method2() {
		System.out.println("부모메소드2");
	}
}

class Child extends Parent {

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("자식메소드1");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("자식메소드2");
	}

	void method3() {
		System.out.println("자식메소드3");
	}

}

public class ParentExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();

		Parent p1 = c1;
		p1.method1();
		p1.method2();
		//p1.method3();
		if(p1 instanceof Child) {
		c1 = (Child) p1;
		c1.method1();
		c1.method2();
		c1.method3();
		}

		Parent p2 = new Parent();
		p2.method1();
		p2.method2();
		if(p2 instanceof Child) {
			c1 = (Child) p2;
			c1.method1();
			c1.method2();
			c1.method3();
		}
	}

}
