package org.zerock.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	/*
	@Test
	public void getList() {
		mapper.getList().forEach(board -> log.info(board));
	}

	
	@Test
	public void insert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로운글2");
		board.setContent("새로작성한글2");
		board.setWriter("newUser2");
		mapper.insert(board);
	}
	
	@Test
	public void insertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("새로운글3");
		board.setContent("새로작성한글3");
		board.setWriter("newUser3");
//		mapper.insert(board);
		mapper.insertSelectKey(board);
		
		// bno 값이 저장됨 - BoardMapper.xml에서 처리
		log.info("insertSelectKey ::");
		log.info(board);
		log.info("-----------------------------------");
	}

	
	@Test
	public void read() {
		BoardVO board = mapper.read(3L);
		log.info(board);
	}
	

	
	@Test
	public void testDelete() {
		log.info("Delete count: "+mapper.delete(3L));
	}
	
	
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		
		board.setBno(2L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("user00");
		
		int count = mapper.update(board);
		log.info("update count: "+count);
	}
	*/
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(2);
		cri.setAmount(10);
	
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board -> log.info(board));
	}

}
