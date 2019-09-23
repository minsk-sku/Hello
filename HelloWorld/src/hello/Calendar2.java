package hello;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int year = sc.nextInt();
		System.out.println();
		int month = sc.nextInt();
		getCal(year, month);
		sc.close();
	}

	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int translateMonth = month - 1;
		cal.set(year, translateMonth, 1);
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Tur", "Fri", "Sat" };
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("            <" + month + "월>");
		for (int i = 0; i < week.length; i++) {

			System.out.print(" " + week[i]);
		}
		System.out.println();

		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", " ");

		}

		for (int i = 1; i < monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0) {
				System.out.println();
			}

		}
	}

}
