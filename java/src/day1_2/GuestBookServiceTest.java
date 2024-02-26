package day1_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GuestBookServiceTest {
	private GuestBookService service=new GuestBookService();
	
	//@Test
	public void saveAndfindAll() {
		service.save(new GuestBook(1L,"ㅎㅇ","홍길동",LocalDate.now()));
		ArrayList<GuestBook> list=service.findAll();
		assertEquals(1, list.size());
	}
	
	//@Test
	public void delete() {
		service.save(new GuestBook(1L,"ㅎㅇ","홍길동",LocalDate.now()));
		service.save(new GuestBook(2L,"ㅎㅇ2","전우치",LocalDate.now()));
		assertEquals(1L, service.delete(2L));
		assertEquals(0L, service.delete(222L));
		
	}
	
	@Test
	public void findById() {
		service.save(new GuestBook(1L,"ㅎㅇ","홍길동",LocalDate.now()));
		service.save(new GuestBook(2L,"ㅎㅇ2","전우치",LocalDate.now()));
		assertEquals(1L, service.findById(2L));
	}
}
