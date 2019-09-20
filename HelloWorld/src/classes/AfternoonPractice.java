package classes;

import java.util.Scanner;

public class AfternoonPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mone = sc.nextInt();
		int PNum = 0;
		int[] paper = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] saveM = new int[paper.length];
		for (int i = 0; i < paper.length; i++) {
			PNum = (int) mone / paper[i];
			mone %= paper[i];
			saveM[i] = PNum; 
			System.out.println(paper[i] + " " + saveM[i]);

		}
		
		
		sc.close();

	}

}
