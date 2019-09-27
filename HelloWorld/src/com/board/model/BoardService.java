package com.board.model;

public interface BoardService {
	public void writeBoard(Board board, Board[] boards);//글작성

	public Board getBoard(int boardNo, Board[] boards);//조회

	public Board[] getBoardList(Board[] boards);//전체리스트
	
	
	
	
	//내용변경
	//글삭제
	public void updateBoard(Board board, Board[] boards);
	
	
	
	
	

	void deleteBoard(int boardNo, Board[] boards);
	
	
	
}
