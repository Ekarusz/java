package day1_1;

import java.util.ArrayList;

public class TodoService {
	// 실제로는 데이터베이스이어야 하는데 데이터베이스 대신 ArrayList를 사용한 것이다
	private ArrayList<Todo> list=new ArrayList<>();
	
	// 할일 추가 메소드
	// Todo를 받아와서 list에 todo를 추가한다
	public void save(Todo todo) {
		list.add(todo);
	}
	
	// 할일 목록 
	public ArrayList<Todo> findAll() {
		return list;
	}
	
	// 할일 변경
	public Long change(Long tno) {
		for(Todo t:list) {
			if(t.getTno()==tno) {
				t.setFinish(!t.getFinish());
				return 1L; 
			}
		}
		return 0L;
	}
	
	// 마이바티스 db 프레임워크에서 save, delete, update의 결과는 정수
	// 할일 삭제 - 왜 결과값이 long인가? 마이바티스에서 삭제의 리턴이 정수라서 그렇다
	public long delete(Long tno) {
		for(Todo t:list) {
			if(t.getTno()==tno) {
				// 인덱스로 삭제 또는 객체로 삭제할 수 있다
				list.remove(t);
				return 1L;
			}
		}
		return 0L;
	}
}
