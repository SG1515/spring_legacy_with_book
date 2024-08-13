package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;

	private Long[] bnoArr = { 5L, 6L, 7L, 8L, 9L, 10L };

	@Test
	public void testList() {
		// 빈 객체 - 현재 사용 X
		Criteria cri = new Criteria();

		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		replies.forEach(reply -> log.info(reply));
	}

//	@Test
//	public void testUpdate() {
//		Long targetRno = 4L;
//		ReplyVO vo = mapper.read(targetRno);
//		vo.setReply("Update Reply");
//		int count = mapper.update(vo);
//		log.info("update count: "+count);
//	}

//	@Test
//	public void testDelete() {
//		Long targetRno = 9L;
//		mapper.delete(targetRno);
//	
//	}

//	@Test
//	public void testRead() {
//		Long targetRno = 1L;
//		ReplyVO vo = mapper.read(targetRno);
//		
//		log.info(vo);
//	}

//	@Test
//	public void testCreate() {
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트"+i);
//			vo.setReplyer("replyer"+i);
//			
//			mapper.insert(vo);
//		});
//	}

//	@Test
//	public void test() {
//		log.info(mapper);
//	}
}
