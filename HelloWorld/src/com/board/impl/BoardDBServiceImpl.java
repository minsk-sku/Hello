package com.board.impl;

import java.util.List;

import com.board.common.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
	}

	@Override
	public List<BoardDB> getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.replyBoard(board);
	}

	@Override
	public void updateBoard(BoardDB board) {
		if (dao.checkResponsibility(board)) {
			dao.updateBoard(board);
			System.out.println("변경되었습니다");
		}
		System.out.println("해당글에 권한이 없습니다");
		dao.updateBoard(board);
	}

	@Override
	public void deleteBoard(BoardDB board) {
		if (dao.checkResponsibility(board)) {
			//dao.deleteBoard1(board);
			if (!dao.checkForReply(board.getBoardNo())) {
				dao.deleteBoard2(board);
				System.out.println("삭제되었습니다");
			} else {
				System.out.println("댓글이 있습니다");
			}
		} else {
			System.out.println("해당글에 권한이 없습니다");

		}
	}

}