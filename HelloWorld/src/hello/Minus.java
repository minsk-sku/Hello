package hello;

public class Minus {
	public static void main(String[] args) {

		int result = minu(1, 6);
		int result1 = mult(4, 7);
		int result2 = di(6, 3);
		double result3 = bala(177);
		System.out.println("bala " + result3);
		System.out.println("Mu " + result1);
		System.out.println("Mi " + result);
		System.out.println("di " + result2);
	}

	public static int minu(int a, int b) {
		return a - b;

	}

	public static int mult(int i, int j) {
		return i * j;
	}

	public static int di(int k, int l) {
		return k / l;

	}

	public static double bala(double height) {
		return (height - 100) * 0.9;
	}

}
