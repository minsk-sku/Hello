package inho;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board(1, "제목1","내용1", null));
		list.add(new Board(1, "제목2","내용2", null));
		list.add(new Board(1, "제목3","내용3", null));

		return list;
	}

}
