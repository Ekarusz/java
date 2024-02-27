package day2_2;

import lombok.Getter;

// 자바의 클래스는 크게 보면 데이터를 저장하는 클래스와 데이터를 처리하는 클래스가 있다
// 데이터를 저장하는 클래스 : Entity
// 		필드 + 게터,세터 + 생성자 ...
// 데이터를 처리하는 클래스 : 알아서 만들어야함
// 날짜 클래스 : 년, 월, 일

@Getter
public class MyDate2 {
	// 년, 월, 일 필드 추가
	// 1. 필드를 결정
	// 2. 정보은닉 -> 외부에서 마음대로 읽고 쓸 수 없다(데이터 조작이 불가능하다)
	// 3. Getter(읽기), Setter(변경) -> 정보은닉한 데이터를 조작가능하게 만든다?
	// 4. 생성자 -> 최소한 2개
	private Long year;
	private Long month;
	private Long day;
	
	public MyDate2() {
		// 기본 생성자 : 인자없는 생성자
	}
	
	public MyDate2(Long year, Long month, Long day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
}
