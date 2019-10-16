package com.board.model;

import java.util.List;

public interface BoardCollection {
	public void writeBoard(Board board, List<Board> boards);

	public Board getBoard(int boardNo, List<Board> boards);

	public List<Board> getBoardList(List<Board> list);

	public void updateBoard(Board board, List<Board> boards);

	public void deleteBoard(int boardNo, List<Board> boards);

}
