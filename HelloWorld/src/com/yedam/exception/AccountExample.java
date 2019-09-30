package com.yedam.exception;

import com.yedam.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account accnt = new Account();
		accnt.deposit(10000);
		System.out.println("예금액: " + accnt.getBalance());

		try {
			accnt.withdraw(20000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}
}
