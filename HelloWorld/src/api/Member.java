package api;

import java.util.Arrays;

public class Member implements Cloneable {
	// public String id;
	public String name;
	// public String password;
	public int age;
	// public boolean adult;
	public int[] scores;
	public Car car;

	// public Member(String id) {
	// this.id = id;
	// }

	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	/*
	 * public Member(String id, String name, String password, int age, boolean
	 * adult) { this.id = id; this.name = name; this.password = password; this.age =
	 * age; this.adult = adult;
	 */

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();// 얕은 복사 name, age복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);// car를 깊은 복제한다
		cloned.car = new Car(this.car.medel);// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;

		/*
		 * public Member getMember() { Member cloned = null; try { cloned = (Member)
		 * clone();
		 * 
		 * } catch (CloneNotSupportedException e) { } return cloned;
		 * 
		 * }
		 * 
		 * @Override public boolean equals(Object obj) { if (obj instanceof Member) {
		 * Member member = (Member) obj; if (id.equals(member.id)) { return true; } }
		 * return false; }
		 * 
		 * @Override public int hashCode() { return id.hashCode(); }
		 */

	}

}
