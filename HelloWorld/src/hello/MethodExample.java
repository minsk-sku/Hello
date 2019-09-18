package hello;

public class MethodExample {
	public static void main(String[] args) {
		int a = 50;
		System.out.println(args[0]);
		showname();
		showage(a);
		showme(177.4, 65.5);
		int result = sum(4, 5);
		System.out.println("결과값" + result);
		System.out.println(args[1]);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	
	
	
	public static void showage(int age) {
		System.out.println("I am " + age + " years old.");
	}
	
	public static void showme(double height, double weight) {
		System.out.println("I am " + height + "cm and " + weight + "kg.");
		
	}
	
	
	public static void showname() {
		System.out.println("Hello my name is S.");
	}

}
