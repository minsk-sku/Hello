package classes;
import java.util.Scanner;
public class Exchange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		exchange(money);
		sc.close();
	}
	public static void exchange(int a) {
		int money = a;
		int result = 0, remain = 0;
		int[] perMoney = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < 8; i++) {
			result = money / perMoney[i];
			remain = money % perMoney[i];
			System.out.println(perMoney[i] + "원짜리: " + result);
			money = remain;
		}
//		int money = a;
//		int result = 0, remain = 0, i = 0;
//		int[] perArray = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		int[] resultAry = new int[perArray.length];
//		System.out.println(money + "은 ");
//		while (true) {
//			result = money / perArray[i];
//			remain = money % perArray[i];
//			resultAry[i] = result;
//			money = remain;
//			i++;
//			if (i == perArray.length) {
//				break;
//			}
//		}
//		for (int j = 0; j < perArray.length; j++) {
//			System.out.println(perArray[j] + "원: " + resultAry[j] + "장.");
//		}
	}
}
