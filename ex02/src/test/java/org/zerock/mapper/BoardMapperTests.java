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
	
	@Test
	public void testPaing() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board -> log.info(board));
	}
	
//	@Test
//	public void test() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운글3");
//		board.setContent("ggdgd333333");
//		board.setWriter("newUSer3");
//		
//		mapper.insert(board);
//		mapper.insertSelectKey(board);
//	}

//	@Test
//	public void testSelect() {
//		//존재하는 게시물 번호로 테스트
//		BoardVO board = mapper.read(3L);
//		log.info(board);
//	}

//	@Test
//	public void testDelete() {
//		log.info("Delete Count: " + mapper.delete(3L));
//	}

	
//	@Test
//	public void testUpdate() { 
//		BoardVO board = new BoardVO();
//		board.setBno(4L);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		board.setWriter("user00");
//		
//		int count = mapper.update(board);
//		log.info("Update count : " + count);
//	}
}
