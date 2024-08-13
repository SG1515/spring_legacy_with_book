package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	// 확장성. 인터페이스는 여러 개 상속 가능하므로.
	// 하나 의 설계도 역할
	// - 내가 만들고 싶은 결과물과 필요한 파라미터 값을 설계해두면 바로 비즈니스 로직에만 집중할 수 있음
	
	public void register(BoardVO board);
	
//	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
	public int getTotalCount(Criteria cri);

}
