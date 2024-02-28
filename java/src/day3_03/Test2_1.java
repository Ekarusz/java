package day3_03;

import lombok.ToString;

//렌트카는 따로 지정하지 않으면 제조사 : 현대, 배기량 : 1300cc 차량이 기본이라고 하자

// 생성자에서 생성자 호출하기
@ToString
class Car1 {
	String 제조사;
	Long 배기량;
	
	// this : 객체 자신을 지칭하는 명령어
	// this.변수; => 자기 자신의 변수를 호출한다
	public Car1(String 제조사, Long 배기량) {
		this.제조사=제조사;
		this.배기량=배기량;
	}
	
	public Car1() {
		// this() : 자기자신의 생성자 => 이렇게 쓸 일이 거의 없다(중요하지는 않다)
		// this를 함수 형태로 사용하면 자기 자신의 생성자로 쓰인다
		// this(); => 자기 자신의 생성자를 호출한다
		this("현대", 1300L);
	}
	
	public Car1(Long 배기량) {
		this("현대", 배기량);
	}
	
	public Car1(String 제조사) {
		this(제조사, 1300L);
	}
}

public class Test2_1 {
	public static void main(String[] args) {
		Car r1 = new Car();
		Car r2 = new Car(2000L);
		Car r3 = new Car("기아", 2000L);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
