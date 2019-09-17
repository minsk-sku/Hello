package hello;

public class Bingo1 {
	public static void main(String[] args) {
	
			int[][] ary = new int[5][5];
			int a = 1;
			for (int i = 0; i < ary.length; i++) {
				for (int j = 0; j < ary[i].length; j++) {
					ary[i][j] = a++;

				}
			}
			for (int i = 4; i >= 0; i--) {
				for (int j = 0; j < ary[i].length; j++) {
					//System.out.print(ary[i][j] + " ");
					System.out.printf("%3d", ary[j][i]);
				}
				System.out.println();
			}
			for (int i = 0; i < ary.length; i++) {
				for (int j = 4; j >= 0; j--) {
					//System.out.print(ary[i][j] + " ");
					System.out.printf("%3d", ary[i][j]);
				}
				System.out.println();
			}
			
			
		}
	}

