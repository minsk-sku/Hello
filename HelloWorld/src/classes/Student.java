package classes;

public class Student {
	
	//특성 필드
	String name;
	String major;
	int studentNo;

	//생성자
	public Student(String string, int i, int j){
		
	}
	Student(String name){
		this.name = name;
	}
	Student(String name, String major){
		this.name = name;
		this.major = major;
	}
	
	
	
	// 기능 메소드
	void study() {
		System.out.println("study");

	}

	void goToSchool() {
		System.out.println("goto school");
	}
}