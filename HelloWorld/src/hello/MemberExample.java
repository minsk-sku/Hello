package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("ls");
		m1.setId("ld");
		m1.setPassword("nn");
		m1.setAge(43);
	
		Member m2 = new Member("admin", "admin123");
		m2.setPassword("none");
		m2.setAge(25);
		
		
		Member m3 = new Member("사용자1", "user1", "user123", 10);
		
		
		Member[] memberAry = { m1, m2, m3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("name 입력");
		String name = sc.nextLine();
		for (Member m : memberAry) {
			if (m.getName().equals(name))
			System.out.println(m.getName() + " " + m.getId() + " " + m.getPassword() + " " + m.getAge());
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}
	
    




}

