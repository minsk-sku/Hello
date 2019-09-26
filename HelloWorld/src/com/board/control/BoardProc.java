package com.board.control;

import java.util.Scanner;

import com.board.model.Board;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
	Board[] boardAry = new Board[10];

	public void excute() {
		while (true) {
			System.out.println("선택");
			System.out.println(" 1. 2. 3. 4. ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				System.out.println("end");
				break;
			}
		}
		System.out.println("end");
	}

	public void writeBoard() {
		System.out.println("");
		System.out.println("");
		int boardNo = sc.nextInt();
		System.out.println("");
		int title = sc.nextInt();
		System.out.println("");
		int content = sc.nextInt();
		System.out.println("");
		int writer = sc.nextInt();
		Board board = new Board(boardNo, title, content, writer);
		for (int i = 0; i < boardAry.length; i++) {
			if (boardAry[i] == null) {
				boardAry[i] = board;
				break;

			}
		}

	}

	public void getBoard() {
		
		System.out.println();
		System.out.println();
		int boardNo = sc.nextInt();
		for(int i=0; i<boardAry.length; i++) {
			if (boardAry != null && getBoardNo()=boardNO) {
				System.out.println();
			}
				
		}

	}

	public void getBoardList() {
		System.out.println();
		for(int i=0; i<boardAry.length; i++) {
			if (boardAry != null) {
				System.out.println();
			}

	}
}
