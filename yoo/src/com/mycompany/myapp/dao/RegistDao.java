package com.mycompany.myapp.dao;

import java.util.List;

import com.mycompany.myapp.dto.Board;

public interface RegistDao {

	int boardInsert(Board board);

	List<Board> boardSelectPage(int pageNo, int rowsPerPage);

	int boardCountAll();

	Board boardSelectByBno(int bno);

	void boardUpdateBhitcount(int bno, int bhitcount);

	void boardDelete(int bno);

	void boardUpdate(Board board);

}
