package classes;

public class AfterResove {
	public static void exchange(int a) {

		int money = a;
		int result = 0, remain = 0;
		int[] perMoney = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < 8; i++) {
			result = money / perMoney[i];
			remain = money % perMoney[i];
			System.out.println(perMoney[i] + " " + result);
			money = remain;
		}

	}
}
