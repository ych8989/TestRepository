package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.RegistDao;
import com.mycompany.myapp.dto.Board;

@Component
public class RegistServiceImpl implements RegistService {
	@Autowired
	private RegistDao registDao;

	@Override
	public int boardWrite(Board board) {
		int bno = registDao.boardInsert(board);
		return bno;
	}

	@Override
	public List<Board> boardListPage(int pageNo, int rowsPerPage) {
		List<Board> list = registDao.boardSelectPage(pageNo, rowsPerPage);
		return list;
	}

	@Override
	public int boardTotalRows() {
		int totalRows = registDao.boardCountAll();
		return totalRows;

	}

	@Override
	public Board getBoard(int bno) {
		Board board = registDao.boardSelectByBno(bno);
		board.setBhitcount(board.getBhitcount() + 1);
		registDao.boardUpdateBhitcount(bno, board.getBhitcount());
		return board;

	}

	@Override
	public String boardCheckBpassword(int bno, String bpassword) {
		String result = "fail";
		Board board = registDao.boardSelectByBno(bno);
		if (board.getBpassword().equals(bpassword)) {
			result = "success";
		}
		return result;

	}

	@Override
	public void boardDelete(int bno) {
		registDao.boardDelete(bno);
	}

	@Override
	public void boardUpdate(Board board) {

		registDao.boardUpdate(board);
	}
}
