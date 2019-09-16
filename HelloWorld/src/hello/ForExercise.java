package hello;

public class ForExercise {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i%2 == 1) {
				sum += i;
			}
			
		}
		System.out.println(sum);			
	}

}
