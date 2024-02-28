package day3_04;

import lombok.*;

// ================== com.world.tire 패키지 =============================
class 타이어 {
	
}
class 한국타이어 extends 타이어 {
	
}
class 넥센타이어 extends 타이어 {
	
}

// =================== com.world.car 패키지 =================================

@Setter
@Getter
class Car {
	한국타이어 tire1;
	넥센타이어 tire2;
}

public class Liskov치환원칙Test2 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setTire2(new 넥센타이어());
		System.out.println(car.getTire1());
		System.out.println(car.getTire2());
	}
}
