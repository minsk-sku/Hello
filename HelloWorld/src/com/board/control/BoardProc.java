package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
	//Board[] boardAry = new Board[10];
	List<Board> boardAry=new ArrayList<>();	
	
	//BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();
	
	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.종료");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요");
				System.out.println("1.작성 2.단건조회 3.전체조회 4.종료");
				
				sc.nextLine();
				e.printStackTrace();
			}

			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public void updateBoard() {
		System.out.println("No.");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("content");
		String title = sc.nextLine();
		String contents = sc.nextLine();
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);

	}

	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글번호입력:");

		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);

		service.writeBoard(board, boardAry);

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}
	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력:");

		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void getBoardList() {

		System.out.println("전체글조회.");
		Board[] resultAry = service.getBoardList(boardAry);
		for (Board board : resultAry) {
			if (board != null)
				System.out.println(board);
		}
	}

	public void deleteBoard() {
		System.out.println("한건삭제");
		System.out.println("조회할 번호를 입력:");

		int boardNo = sc.nextInt();
		service.deleteBoard(boardNo, boardAry);

	}

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
}
