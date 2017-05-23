package com.mycompany.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.service.Exam10Service1;
import com.mycompany.myapp.service.Exam10Service2;
import com.mycompany.myapp.service.Exam10Service3;
import com.mycompany.myapp.service.Exam10Service4;
import com.mycompany.myapp.service.Exam10Service5;

@Controller
public class Exam10DIController {

	@Autowired
	private Exam10Service1 exam10Service1;
	@Autowired
	private Exam10Service2 exam10Service2;
	@Autowired
	private Exam10Service3 exam10Service3;
	@Autowired
	private Exam10Service4 exam10Service4;
	@Autowired
	private Exam10Service5 exam10Service5;

	@RequestMapping("/di/exam01")
	public String exam01() {
		exam10Service1.join();
		exam10Service2.join();
		exam10Service3.join();
		exam10Service4.join();
		exam10Service5.join();
		return "di/exam01";
	}

	@RequestMapping("/di/exam02")
	public String exam02() {
		exam10Service1.join();
		exam10Service2.join();
		exam10Service3.join();
		exam10Service4.join();
		exam10Service5.join();
		return "di/exam02";
	}

}
