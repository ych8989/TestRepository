package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.Board;

@Component
public class RegistDaoImpl implements RegistDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegistDaoImpl.class);

	@Override
	public int boardInsert(Board board) {
		int bno = -1;
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql = "insert into board ";
			sql += "(bno, btitle, bcontent, bwriter, bdate, bpassword, bhitcount, boriginalfilename, bsavedfilename, bfilecontent) ";
			sql += "values ";
			sql += "(regist_bno_seq.nextval, ?, ?, ?, sysdate, ?, 0, ?, ?, ?)";

			// SQL 문을 전송해서 실행
			// 테이블 정의시 컬럼의 속성으로 자동 증가를 지정할 수 있는 DB일 경우(MySQL, MS SQL)
			// PreparedStatement pstmt = conn.prepareStatement(sql,
			// Statement.RETURN_GENERATED_KEYS);
			// 오라클일 경우 Sequence 외부 객체로 자동 증가값을 얻기 때문에 다음과 같이 지정
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "bno" });

			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setString(4, board.getBpassword());
			pstmt.setString(5, board.getBoriginalfilename());
			pstmt.setString(6, board.getBsavedfilename());
			pstmt.setString(7, board.getBfilecontent());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			bno = rs.getInt(1);

			rs.close();
			pstmt.close();

			LOGGER.info("행 추가 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}
		return bno;
	}

	@Override
	public List<Board> boardSelectPage(int pageNo, int rowsPerPage) {
		List<Board> list = new ArrayList<>();
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql = "select * ";
			sql += "from ( ";
			sql += "  select rownum as r, bno, btitle, bwriter, bdate, bhitcount ";
			sql += "  from ( ";
			sql += "    select bno, btitle, bwriter, bdate, bhitcount from board order by bno desc ";
			sql += "  ) ";
			sql += "  where rownum <=? ";
			sql += ") ";
			sql += "where r>=? ";

			// SQL 문을 전송해서 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pageNo * rowsPerPage);
			pstmt.setInt(2, (pageNo - 1) * rowsPerPage + 1);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBwriter(rs.getString(4));
				board.setBdate(rs.getDate("bdate"));
				board.setBhitcount(rs.getInt("bhitcount"));
				list.add(board);
			}
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			LOGGER.info("ClassNotFoundException");
		} catch (SQLException e) {
			LOGGER.info("SQLException");
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}
		return list;

	}

	@Override
	public int boardCountAll() {
		int count = 0;
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql = "select count(*) from board";

			// SQL 문을 전송해서 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			count = rs.getInt(1);
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}
		return count;
	}

	@Override
	public Board boardSelectByBno(int bno) {
		Board board = null;
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql = "select * from board where bno=?";

			// SQL 문을 전송해서 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBpassword(rs.getString("bpassword"));
				board.setBhitcount(rs.getInt("bhitcount"));
				board.setBoriginalfilename(rs.getString("boriginalfilename"));
				board.setBsavedfilename(rs.getString("bsavedfilename"));
				board.setBfilecontent(rs.getString("bfilecontent"));
			}
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}
		return board;
	}

	@Override
	public void boardUpdateBhitcount(int bno, int bhitcount) {
		int count = 0;
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql = "update board set bhitcount=? where bno=?";

			// SQL 문을 전송해서 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bhitcount);
			pstmt.setInt(2, bno);
			pstmt.executeQuery();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public void boardDelete(int bno) {
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql = "delete from board where bno=?";

			// SQL 문을 전송해서 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public void boardUpdate(Board board) {
		Connection conn = null;
		try {
			// JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결 문자열 작성
			String url = "jdbc:oracle:thin:@117.17.198.43:1531:orcl";

			// 연결 객체 얻기
			conn = DriverManager.getConnection(url, "chuser", "iot12345");
			LOGGER.info("연결 성공");

			// SQL 작성
			String sql;
			if (board.getBoriginalfilename() != null) {
				sql = "update board set btitle=?,bcontent=?,bpassword=?"
						+ ",bdate=sysdate,boriginalfilename=?,bsavedfilename=?"
						+ ",bfilecontent=?where bno=?";
			} else {
				sql = "update board set btitle=?,bcontent=?,bpassword=?"
						+ ",bdate=sysdate where bno=?";
			}
			// SQL 문을 전송해서 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBpassword());
			if (board.getBoriginalfilename() != null) {
				pstmt.setString(4, board.getBoriginalfilename());
				pstmt.setString(5, board.getBsavedfilename());
				pstmt.setString(6, board.getBfilecontent());
				pstmt.setInt(7, board.getBno());
			} else {
				pstmt.setInt(4, board.getBno());
			}
			pstmt.executeUpdate();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
		}

	}
}
