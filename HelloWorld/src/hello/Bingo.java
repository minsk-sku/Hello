package hello;

public class Bingo {
	public static void main(String[] args) {

		int[][] ary = new int[5][5];
		int a = 1;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = a++;

			}
		}
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				//System.out.print(ary[i][j] + " ");
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
