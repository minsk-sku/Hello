package hello;

import java.util.Scanner;

public class AccountExample {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("---------------");
			int menu = sc.nextInt();
			if (menu == 1) {
				creatAccount();
			} else if (menu == 2) {
				getAccountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();

			} else if (menu == 5) {
				run = false;

			}
			System.out.println("종료");

		}
	}

	// 계좌생성
	public static void creatAccount() {
		System.out.println("creatAccount()");
		System.out.println("계좌번호 입력");
		String accountNo = sc.nextLine();
		System.out.println("사용자명 입력");
		String accountName = sc.nextLine();
		System.out.println("첫 계좌금액");
		int accountBalance = sc.nextInt();
		Account accont = new Account(accountNo, accountName, accountBalance);
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = accont;
				break;
				
			}
		}
	}

	public static void getAccountList() {
		System.out.println("getAccountList()");
		for (Account a : accountArray) {
			if (a != null)
				System.out.println(a.getAno() + " " + a.getOwner() + " " + a.getBalance());

		}

	}

	public static void deposit() {
		System.out.println("deposit()");
		System.out.println("계좌번호");
		String accountNo = sc.nextLine();
		System.out.println("입금");
		int accountBalance = sc.nextInt();
		for (Account accont : accountArray) {
			if (accont != null && accont.getAno().equals(accountNo)) {
				accont.setBalance(accountBalance);
			}

		}

	}

	public static void withdraw() {
		System.out.println("withdraw()");
		System.out.println("계좌번호");
		String accountNo = sc.nextLine();
		System.out.println("출금");
		int accountBalance = sc.nextInt();
		for (Account accont : accountArray) {
			if (accont != null && accont.getAno().equals(accountNo)) {
				accont.setBalance(-accountBalance);
			}
		}
	}

	public static Account findAccount(String ano) {
		return null;

	}
}
