package com.yedam.abstractpkg;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("breath");
	}

	public abstract void sound();

}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("nya");
		
		
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("wal");
	
	}
}
