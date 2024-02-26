package day1_1;

import java.time.LocalDate;

// 테스트 클래스 : main 대신 사용

public class TodoTest {
	public void test() {
		// 정수 literal의 타입은 int이다
		// Todo t1=new Todo(1, "작업1", LocalDate.now(), false);
		// -> Todo t1=new Todo(1L, "작업1", LocalDate.now(), false); 또는 Todo t1=new Todo((long)1, "작업1", LocalDate.now(), false);
		
		// 객체 생성을 담당하는 메소드 : 생성자(constructor)
		// 생성자는 new 할 때만 호출된다
		Todo t1=new Todo(1L, "작업1", LocalDate.now(), false);
	}
}
