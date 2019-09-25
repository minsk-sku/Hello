package com.yedam;

public class CellPhone {

	String model;
	String color;

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public CellPhone() {
		super();
	}

	void powerOn() {
		System.out.println("전원 켬");
	}

	void powerOff() {
		System.out.println("전원 끔");
	}

	void bell() {
		System.out.println("벨");

	}

	void hangup() {
		System.out.println("전화 끔");
	}

}
