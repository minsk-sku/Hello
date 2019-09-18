package hello;

public class PrPr {
	public static void main(String[] args) {
		
		printstar(8, 5);
	}

	public static void printstar(int a, int b) {
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				
				System.out.print("*");;
			}
			System.out.println();
		}
	}
}

