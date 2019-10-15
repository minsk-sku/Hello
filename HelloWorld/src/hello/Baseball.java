package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nar = new int[3];
		for (int i = 0; i < nar.length; i++) {
			nar[i] = (int) (Math.random() * 9 + 1);

		}
	}

	boolean run = true;
	
	while(run)
	{
		System.out.println("input 3 number");
		System.out.println("--------------");
		int[] mar = new int[3];
		for (int j = 0; j < mar.length; j++) {
			mar[j] = sc.nextInt();
		}
		int st = 0, ba = 0;
		for (int m = 0; m < mar.length; m++) {
			for (int n = 0; n < nar.length; n++) {
				if (m == n && mar[m] == nar[n]) {
					st += 1;
				} else if (m != n && mar[m] == nar[n]) {
					ba += 1;
				}

			}
		}
		/*
		 * }else if (myn[k] == nar[k + 1] || myn[k] == nar[k + 2]) { ba += 1; } else if
		 * (st == 3) { System.out.println("out"); run = false;
		 * 
		 * } System.out.println("s: " + st + "b: " + ba);
		 */

	}System.out.println("s: "+st+"b: "+ba);if(st==3)
	{
		System.out.println("out");
		run = false;
	}

}

}
}