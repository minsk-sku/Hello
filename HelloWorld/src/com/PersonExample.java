package com;

import com.mycompany.lsj.Person;

public class PersonExample {
	public static void main(String[] args) {
		Person p1= new Person();
		p1.setName("Hong");
		p1.setAge(20);
		p1.setHeight(181.1);
		p1.setWeight(77.7);
		System.out.println(p1.getName());
	}

}
