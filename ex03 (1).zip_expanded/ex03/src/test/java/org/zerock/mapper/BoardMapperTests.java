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

//	@Test
//	public void test() {
//		mapper.getList().forEach(board -> log.info(board));
//		log.info("================================");
//	}
//
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운글2");
//		board.setContent("새로작성한글2");
//		board.setWriter("newUser2");
//
////		mapper.insert(board);
//		mapper.insertSelectKey(board);
//		log.info("================================");
//		log.info(board);
//	}

//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(3L);
//		log.info("================================");
//		log.info(board);
//	}

//	@Test
//	public void testdelete() {
//		int num = mapper.delete(3L);
//		log.info("================================");
//		log.info("deletedCount:"+num);
//	}

//	@Test
//	public void testupdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(2L);
//		board.setTitle("수정된제목 ");
//		board.setContent("수정된내용 ");
//		board.setWriter(" user00");
//		int cnt = mapper.update(board);
//		log.info("================================");
//		log.info("updateCount:"+cnt);
//	}
	
//	@Test
//	public void testPaging() {
//		Criteria cri = new Criteria();
//		cri.setPageNum(2);
//		cri.setAmount(10);
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		list.forEach(board -> log.info(board));
//	}

	

}
