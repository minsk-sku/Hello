package com.mycompany.lsj;

class Access2 {

	public Access2() {
		System.out.println("Access2");

	}

}

public class Access1 {
	public int field1;
	int field2;
	private int field3;
	public void method1() {
		field3 = 10;
		System.out.println("method1");
	}
	public void method2() {
		System.out.println(field3);
		System.out.println("method2");
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Access1");
		
	}

}
