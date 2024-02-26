package day1_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

// junit으로 테스트하는건 필수사항이다!
public class TodoServiceTest {
	// TodoService를 테스트하기 위해 객체를 생성
	// Todo가 없는 상태에서 Todo의 개수가 0인지 테스트한다
	private TodoService service=new TodoService();
	
	// junit으로 테스트하는 메소드는 반드시 public void 형식이어야 한다
	// @Test
	public void saveAndfindAllTest() {
		service.save(new Todo(1L,"자바공부",LocalDate.now(),false));
		ArrayList<Todo> list=service.findAll();
		
		// assert 메소드는 검증하는 메소드
		// assertEquals(내가 원하는 값, 실제 값);
		assertEquals(1, list.size());
	}
	
	// 모든 @Test 메소드들은 독립적으로 실행된다
	// 즉 여러개 한번에 테스트하지 말고 하나씩 따로따로 테스트해야한다
	// @Test
	public void deleteTest() {
		service.save(new Todo(1L,"자바공부",LocalDate.now(),false));
		service.save(new Todo(2L,"영어공부",LocalDate.now(),false));
		
		// 삭제 성공 테스트
		assertEquals(1L, service.delete(2L));
		// 삭제 실패 테스트
		assertEquals(0L, service.delete(222L));
	}
	
	@Test
	public void UpdateTest() {
		service.save(new Todo(1L,"자바공부",LocalDate.now(),false));
		service.save(new Todo(2L,"영어공부",LocalDate.now(),false));
		assertEquals(1L, service.change(1L));
	}
}
