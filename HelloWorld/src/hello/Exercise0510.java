package hello;
import java.util.Scanner;

public class Exercise0510 {
	public static void main(String[] args) {
		
			boolean run = true;
			int studentNum = 0;
			int[] scores = null;
			Scanner scanner = new Scanner(System.in);

			while (run) {
				System.out.println("-----------------------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("-----------------------------------------------------------");
				System.out.print("선택>");

				int selectNo = scanner.nextInt();

				if (selectNo == 1) {
					System.out.print("학생수> ");
					studentNum = scanner.nextInt();
					scores = new int[studentNum];

				} else if (selectNo == 2) {
									
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]" + "> ");
						scores[i] = scanner.nextInt();
					}

				} else if (selectNo == 3) {
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]" + ": " + scores[i]);
					}

				} else if (selectNo == 4) {
					int maxScore = 0, sum = 0;
					for (int i = 0; i < scores.length; i++) {
						maxScore = (maxScore > scores[i] ? maxScore : scores[i]);
						sum += scores[i];
					}
					double avgScore = (double) sum / scores.length;
					System.out.println("최고 점수: " + maxScore);
					System.out.printf("평균점수: %.3f", avgScore);
					System.out.println();
									
					

				} else if (selectNo == 5) {
					run = false;
				

				}
			}

			System.out.println("프로그램 종료");
			scanner.close();
		}

	}



