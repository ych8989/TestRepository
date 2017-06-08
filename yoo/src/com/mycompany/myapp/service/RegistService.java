package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.dto.Board;

public interface RegistService {

	int boardWrite(Board board);

	List<Board> boardListPage(int pageNo, int rowsPerPage);

	int boardTotalRows();

	Board getBoard(int bno);

	String boardCheckBpassword(int bno, String bpassword);

	void boardDelete(int bno);

	void boardUpdate(Board board);

}
