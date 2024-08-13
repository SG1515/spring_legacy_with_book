package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;

	/*
	@Test
	public void register() {
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글 Service");
		board.setContent("새로운 글 Service");
		board.setWriter("user01");
		
		service.register(board);
		
		log.info("글번호: "+board.getBno());
	}
	
	@Test
	public void getList() {
		service.getList().forEach(board -> log.info(board));
	}
	

	@Test
	public void get() {
		log.info(service.get(2L));
		
	}
	
	
	@Test
	public void update() {
		BoardVO board = service.get(4L);
		if(board == null) {
			return;
		}else { 
			board.setTitle("수정된 글 Service");
			log.info("modify result: "+service.modify(board));
		}
	}
	
	 */
	
	@Test
	public void delete() {
		log.info("delete result: "+service.remove(4L));
	}

}
