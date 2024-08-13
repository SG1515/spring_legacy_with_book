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

//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new title");
//		board.setContent("new Content");
//		board.setWriter("user01");
//		
//		service.register(board);
//		
//		log.info("==============생성된 게시물의 번호: "+board.getBno());
//	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}

}
