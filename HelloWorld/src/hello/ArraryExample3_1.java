package hello;

import java.util.Scanner;

public class ArraryExample3_1 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택");
			
			int selectNo = scanner.nextInt();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[][] intAry = new int[2][];
		intAry[0] = new int[3];
		intAry[1] = new int[4];
		int a = 8;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = a++;
			}

		}
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				// System.out.print(ary[i][j] + " ");
				System.out.printf("%2d", intAry[i][j]);
			}
			System.out.println();
		}
	
	

	int sum=0;for(
	int i = 0;i<intAry.length;i++)
	{
		sum = 0;
		for (int j = 0; j < intAry[i].length; j++) {
			sum += intAry[i][j];
		}
		System.out.println("intAry" + "[" + i + "]" + sum);
	}System.out.println();
}
}
