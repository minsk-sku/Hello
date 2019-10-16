import java.util.Scanner;

import hello.Account;

public class AccontTest {

	private static AccountNew[] accountArray = new AccountNew[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.회원등록 2.회원번호 조회 3.등록그룹별 리스트");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				getAccountList();
			} else if (menu == 3) {
				courseList();
			} else {
				run = false;

			}
		}
	}

	// 계좌 인스턴스를 만드는 메소드.
	public static void createAccount() {
		System.out.println("createAccount()");
		System.out.println("새 회원번호 입력: ");
		String accountNO = sc.nextLine();
		System.out.println("사용자명 입력: ");
		String accountName = sc.nextLine();
		System.out.println("등록 과정: ");
		System.out.println("------------------------");
		System.out.println("1.수영 2.테니스 3.배드민턴");
		System.out.println("------------------------");
		int accountCourse = sc.nextInt();

		AccountNew accnt = new AccountNew(accountNO, accountName, accountCourse);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = accnt;
				break;
			}

		}

	}

	public static void getAccountList() {
		System.out.println("회원번호 조회");
		for (AccountNew a : accountArray) {
			if (a != null)
				System.out.println("회원번호: " + a.getId() + ", 이름: " + a.getName() + "등록과정: " + a.getCourse());
		}
	}

	public static void courseList() {
		System.out.println("그룹별 리스트");
		System.out.println("등록 과정: ");
		System.out.println("------------------------");
		System.out.println("1.수영 2.테니스 3.배드민턴");
		System.out.println("------------------------");
		int accountCourse = sc.nextInt();
		for (AccountNew acct : accountArray) {
			if (acct != null && acct.getCourse().equals(accountCourse)) {
				System.out.println(acct);
			}

		}

	}

}
