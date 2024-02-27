package day2_4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Sample {
	private Long jumsu;
	
	// 객체가 가진 jumsu로 합격, 불합격을 판정
	public String 판정1() {
		return jumsu>=70? "합격" : "불합격";
	}
	
	// 외부에서 주어진 score로 합격, 불합격을 판정
	public static String 판정2(Long score) {
		return score>=70? "합격" : "불합격";
	}
}

// sum 메소드는 객체가 가진 필드를 가지고 계산하므로 결과도 다르다
// static을 사용하는 경우
//		항상 같은 값을 가지는 필드
// 		입력을 주면 결과가 정해진 메소드

public class StaticTest2 {
	public static void main(String[] args) {
		// 객체를 new 한다 -> 객체의 정보가 다르다
		Sample s1=new Sample(75L);
		Sample s2=new Sample(65L);
		
		// 판정1()함수는 메소드를 객체가 가진 필드로 계산 -> 객체마다 결과가 다르다
		// 필드에 접근한다 -> this가 필요하다 -> this는 new하고 나서 만들어진다 -> new가 필요하다
		System.out.println(s1.판정1());
		System.out.println(s2.판정1());
		
		// 판정2()함수는 메소드를 외부입력값으로 계산 -> 입력이 같으면 결과가 같다
		// 필드가 필요없다(객체가 필요없다) -> this가 필요없다 -> new가 필요없다 -> 클래스 이름으로 사용한다(static이다)
		// System.out.println(s1.판정2(75L)); => System.out.println(Sample.판정2(75L));
		// -> 객체를 생성할 필요가 없기 때문에 '클래스.~' 로 바뀐다?
		System.out.println(Sample.판정2(75L));
		System.out.println(Sample.판정2(75L));
	}
}
