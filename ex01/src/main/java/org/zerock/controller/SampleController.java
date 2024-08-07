package org.zerock.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@GetMapping("basic")
	public void basicGet() {
		log.info("basic..............");
	}
	
	
	//데이터 가져오기 객체로
	@GetMapping("ex01")
	public String ex01(SampleDTO dto) {
		log.info("ex.............01");
		log.info("dto :" + dto);
		return "ex01";
	}
	
	
	//데이터 가져오기 RequestParam
	@GetMapping("ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("나이 : "+ age);
		log.info("이름 : "+ name); 
		
		return "ex02";
	}
	
	//데이터값을 다른 페이지로 redirect하기 데이터 전달은 RedirectAttributs로 할 수 있음
	@GetMapping("ex03")
	public String ex03(RedirectAttributes rttr) {
		rttr.addAttribute("name", "bbb");
		rttr.addAttribute("age", 30);
		rttr.addAttribute("page", "30");
		return "redirect:/sample/ex04";
	}
	
	// View => Controller => View
	// 객체는 가능하지만 일반 변수는 가능하지 않음.
	 //requestParam을 하지 않아도 된다. 
	@GetMapping("ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("ex04..............");
		log.info("dto :" + dto);
		log.info("dto : " + page);
		return "ex04";
	}
	
	
	@GetMapping("ex05")
	public void ex05() {
		
		log.info("ex05.........");
	}
	
	
	@GetMapping("ex06")
	public @ResponseBody SampleDTO ex06() {
		SampleDTO dto = new SampleDTO();
		dto.setName("홍길동");
		dto.setAge(20);
		
		return dto;
	}
	
	@GetMapping("ex07")
	public ResponseEntity<List<SampleDTO>> ex07() {
		log.info("ex07.............");
		List<SampleDTO> list = new ArrayList<>();
		
		
		//{"name":"홍길동"}
		String massage = "{\"name\" : \"홍길동\"}";
		SampleDTO dto = new SampleDTO();
		dto.setName("홍길동");
		dto.setAge(20);
		list.add(dto);
		list.add(dto);
		list.add(dto);
		list.add(dto);
		list.remove(1);
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(list, header, HttpStatus.OK);
		
	}
	
}
