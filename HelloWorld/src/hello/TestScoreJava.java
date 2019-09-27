package hello;

import java.util.Scanner;

public class Score {
	

	private String stNo;
	private String stNm;
	private int koSc;
	private int enSc;
	private int mtSc;
	private int toSc;
	private double avSc;
	
	
	

	public Score() {
	}
	
	
	
	
	
	




	public Score(String stNo, String stNm, int koSc, int enSc, int mtSc) {
		super();
		this.stNo = stNo;
		this.stNm = stNm;
		this.koSc = koSc;
		this.enSc = enSc;
		this.mtSc = mtSc;
	}
	

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public String getStNm() {
		return stNm;
	}

	public void setStNm(String stNm) {
		this.stNm = stNm;
	}

	public int getKoSc() {
		return koSc;
	}

	public void setKoSc(int koSc) {
		this.koSc = koSc;
	}

	public int getEnSc() {
		return enSc;
	}

	public void setEnSc(int enSc) {
		this.enSc = enSc;
	}

	public int getMtSc() {
		return mtSc;
	}

	public void setMtSc(int mtSc) {
		this.mtSc = mtSc;
	}

}

public class TestScoreJava {
	private static Score[] scoreArray = new Score[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.성적등록 2.목록 3.조회 4.전체통계(평균) 5.정렬(총점기준 오름차순) 6.종료");
			System.out.println("----------------------------------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createScore();
			} else if (menu == 2) {
				getScoreList();
			} else if (menu == 3) {
				getStudent();
			} else if (menu == 4) {
				;
			} else if (menu == 5) {

			} else if (menu == 6) {
				run = false;
			}
		}

	}

	public static void createScore() {
		System.out.println("1.성적등록");
		System.out.println("학생번호 입력: ");
		String stNo = sc.nextLine();
		System.out.println("학생 이름 입력: ");
		String stNm = sc.nextLine();
		System.out.println("국어: ");
		int koSc = sc.nextInt();
		System.out.println("영어: ");
		int enSc = sc.nextInt();
		System.out.println("수학: ");
		int mtSc = sc.nextInt();

		Score stsc = new Score(stNo, stNm, koSc, enSc, mtSc);
		for (int i = 0; i < scoreArray.length; i++) {
			if (scoreArray[i] == null) {
				scoreArray[i] = stsc;
				break;
			}

		}

	}

	public static void getScoreList() {
		System.out.println("2.목록");
		for (Score s : scoreArray) {
			if (s != null)
				System.out.println("학생번호: " + s.getStNo() + ", 이름: " + s.getStNm() + "국어: " + s.getKoSc() + "영어: "
						+ s.getEnSc() + "수학: " + s.getMtSc());
		}
	}

	public static void getStudent() {
		System.out.println("3.조회");
		System.out.println("학생번호:  ");
		String stId = sc.nextLine();
		String sName = null;
		int sKo = 0, sEn = 0, sMt = 0, sTo=0;
		double sAv=0.0;
		for (Score sco : scoreArray) {
			if (sco != null && sco.getStNo().equals(stId)) {
				sName = sco.getStNm();
				sKo = sco.getKoSc();
				sEn = sco.getEnSc();
				sMt = sco.getMtSc();
				sTo = sKo + sEn + sMt;
				sAv = (double) sTo/3;
				System.out.println("이름 :  " + sName + "국어: " + sKo + "영어: " + sEn + "수학: " + sMt +"총점:  " + sTo + "평균;  " + sAv);
			}
		}
		
			
		}

		
		
		
		
	}
	
	
	
	
	
	
}