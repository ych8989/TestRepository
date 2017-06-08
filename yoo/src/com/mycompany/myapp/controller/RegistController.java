package com.mycompany.myapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.dto.Board;
import com.mycompany.myapp.service.RegistService;

@Controller
public class RegistController {
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private RegistService registService;

	@RequestMapping("/img")
	public void download(HttpServletResponse response, @RequestHeader("User-Agent") String userAgent, int bno) throws IOException {
		//응답 HTTP 헤더행을 추가
		//1)파일이름(옵션)
		Board board = registService.getBoard(bno);
		String fileName = board.getBsavedfilename();
		String encodingFileName;
		if (userAgent.contains("MSIE") || userAgent.contains("Trident") || userAgent.contains("Edge")) {
			encodingFileName = URLEncoder.encode(fileName, "UTF-8");
		} else {
			encodingFileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		}

		response.addHeader("Content-Disposition", "attachment; filename=\"" + encodingFileName + "\""); //attachment -> 파일로저장하는행위를 취해야한다.(다이얼로그를 띄워야한다.)
		//2)파일종류(필수)
		response.addHeader("Content-Type", board.getBfilecontent());
		//3)파일사이즈(옵션)
		File file = new File(servletContext.getRealPath("/WEB-INF/upload/" + fileName));
		long fileSize = file.length();
		response.addHeader("Content-Length", String.valueOf(fileSize));

		//응답 HTTP 본문에 파일 데이터를 출력
		OutputStream os = response.getOutputStream();
		FileInputStream fis = new FileInputStream(file);
		FileCopyUtils.copy(fis, os);
		os.flush();
		fis.close();
		os.close();
	}
	
	
	@RequestMapping("/viewimage")
	public String viewImage(int bno, Model model){
		Board board = registService.getBoard(bno);
		model.addAttribute("board", board);
		return "/viewimage";
		
	}
	
	@RequestMapping(value = "/queListUpdate", method = RequestMethod.GET)
	public String queListUpdateGet(int bno, Model model) {
		Board board = registService.getBoard(bno);
		model.addAttribute("board", board);
		return "/queListUpdate";

	}

	@RequestMapping(value = "/queListUpdate", method = RequestMethod.POST)
	public String queListUpdatePost(Board board) throws Exception {
		// 첨부 파일이 변경되었는지 검사
		if (!board.getBattach().isEmpty()) {
			// 첨부 파일에 대한 정보를 컬럼값으로 설정
			board.setBoriginalfilename(board.getBattach().getOriginalFilename());
			board.setBfilecontent(board.getBattach().getContentType());
			String fileName = new Date().getTime() + "-" + board.getBoriginalfilename();
			board.setBsavedfilename(fileName);

			// 첨부 파일을 서버 로컬 시스템에 저장
			String realPath = servletContext.getRealPath("/WEB-INF/upload/");
			File file = new File(realPath + fileName);
			board.getBattach().transferTo(file);

		}
		registService.boardUpdate(board);
		return "redirect:/queListDetail?bno=" + board.getBno();
	}

	@RequestMapping("/queListDelete")
	public String queListDelete(int bno) {
		registService.boardDelete(bno);
		return "redirect:/queList";
	}

	@RequestMapping("/queListCheckBpassword")
	public String queListCheckBpassword(int bno, String bpassword, Model model) {
		String result = registService.boardCheckBpassword(bno, bpassword);
		model.addAttribute("result", result);
		return "/queListCheckBpassword";
	}

	@RequestMapping(value = "/queListDetail", method = RequestMethod.GET)
	public String queListDetailGet(int bno, Model model) {
		Board board = registService.getBoard(bno);
		model.addAttribute("board", board);
		return "queListDetail";
	}

	@RequestMapping(value = "/queList", method = RequestMethod.GET)
	public String queListGet(@RequestParam(defaultValue = "1") int pageNo, Model model) {
		int rowsPerPage = 5;
		// 한 그룹을 구성하는 페이지 수
		int pagesPerGroup = 5;
		// 총 행수
		int totalRows = registService.boardTotalRows();
		// 전체 페이지 수
		int totalPageNo = (totalRows / rowsPerPage) + ((totalRows % rowsPerPage != 0) ? 1 : 0);
		// 전체 그룹 수
		int totalGroupNo = (totalPageNo / pagesPerGroup) + ((totalPageNo % pagesPerGroup != 0) ? 1 : 0);
		// 현재 그룹 번호
		int groupNo = (pageNo - 1) / pagesPerGroup + 1;
		// 현재 그룹의 시작 페이지 번호
		int startPageNo = (groupNo - 1) * pagesPerGroup + 1;
		// 현재 그룹의 마지막 페이지 번호
		int endPageNo = startPageNo + pagesPerGroup - 1;
		if (groupNo == totalGroupNo)
			endPageNo = totalPageNo;

		// 현재 페이지의 행의 데이터 가져오기
		List<Board> list = registService.boardListPage(pageNo, rowsPerPage);
		// View로 넘겨줄 데이터
		model.addAttribute("list", list);
		model.addAttribute("pagesPerGroup", pagesPerGroup);
		model.addAttribute("totalPageNo", totalPageNo);
		model.addAttribute("totalGroupNo", totalGroupNo);
		model.addAttribute("groupNo", groupNo);
		model.addAttribute("startPageNo", startPageNo);
		model.addAttribute("endPageNo", endPageNo);
		model.addAttribute("pageNo", pageNo);

		return "queList";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String registGet() {
		return "regist";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String registPost(Board board) throws IllegalStateException, IOException {
		board.setBoriginalfilename(board.getBattach().getOriginalFilename());
		board.setBfilecontent(board.getBattach().getContentType());
		String fileName = new Date().getTime() + "-" + board.getBoriginalfilename();
		board.setBsavedfilename(fileName);
		String realPath = servletContext.getRealPath("/WEB-INF/upload/");
		File file = new File(realPath + fileName);
		board.getBattach().transferTo(file);

		int bno = registService.boardWrite(board);

		return "redirect:/queList";
	}
	
}