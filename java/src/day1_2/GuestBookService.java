package day1_2;

import java.util.ArrayList;

public class GuestBookService {
	private ArrayList<GuestBook> list=new ArrayList<>();
	
	// 목록
	public ArrayList<GuestBook> findAll() {
		return list;
	}
	
	public long findById(Long gno) {
		for(GuestBook g:list) {
			if(g.getGno()==gno) {
				g.setContent(g.getContent());
				return 1L;
			}
		}
		return 0L;
	}
	
	// 작성
	public void save(GuestBook gb) {
		list.add(gb);
	}
	
	// 삭제
	public long delete(Long gno) {
		for(GuestBook g:list) {
			if(g.getGno()==gno) {
				list.remove(g);
				return 1L;
			}
		}
		return 0L;
	}
}
