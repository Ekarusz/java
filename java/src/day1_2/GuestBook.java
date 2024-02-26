package day1_2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

// 1. GuestBook 클래스를 작성하시오(방명록 : 번호, 내용, 작성자, 작성일)
// 2. GuestBookService 클래스를 작성하시오
//		findAll(), findById(Long 번호) -> 번호를 주면 GuestBook을 찾아서 리턴, delete(), update()
// 3. GuestBookService를 테스트하시오
// public void findByIdTest() {service.findById(1L)
// //1번 방명록만 있다면 assertNotNull(service.findById(1L); assertNull(service.findById(222L);}

@Getter
@Setter
public class GuestBook {
	private Long gno;
	private String content;
	private String nickname;
	private LocalDate writeday;
	
	public GuestBook(Long gno, String content, String nickname, LocalDate writeday) {
		this.gno=gno;
		this.content=content;
		this.nickname=nickname;
		this.writeday=writeday;
	}
}
