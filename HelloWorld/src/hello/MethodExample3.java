package hello;

public class MethodExample3 {
	public static void main(String[] args) {

		int[] intAry = { 1, 2, 3, 4, 5 };
		int sum = 0;
		sum = sumArray(intAry);
		System.out.println(sum);

		int[] intAry2 = { 1, 2, 3, 4, 5, 6 };
		sum = sumArray(intAry2);
		System.out.println(sum);

		int[] intAry3 = { 1, 2, 3 };
		sum = sumArray(intAry3);
		System.out.println(sum);

		printStar(5, "*");
		printStar1(6, 5);
		printStar2(3, 4);
		printStar3(8);
		printStar4(5);
		printStar5(5);

		int[] artt = null;
		artt = showArray(1, 2, 3);
		for (int i = 0; i < artt.length; i++) {
			System.out.println(artt[i]);
		}
		// ===>enhanced for
		for (int a : artt) {
			System.out.println(a);
		}

	}

	public static int sumArray(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];

		}
		return sum;
	}

	public static void printStar(int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}

	public static void printStar1(int a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void printStar2(int a, int b) {
		int c = 1;
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%2d", c);
				c++;

			}
			System.out.println();
		}
	}

	public static void printStar3(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printStar4(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printStar5(int a) {
		for (int i = a; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int[] showArray(int... arg) {
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}

	// public static int[] showArray(int a, int b, int c, int d, int e) {
	// int[] ary = { a*2, b*2, c*2, d*2, e*2};
	// return ary;

}
