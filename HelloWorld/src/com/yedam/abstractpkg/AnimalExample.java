package com.yedam.abstractpkg;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		Animal animal = null;
		animal = cat;
		animal.sound();
		animal = dog;
		animal.sound();
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
