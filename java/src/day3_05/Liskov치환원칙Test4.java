package day3_05;

import lombok.*;

// ================== com.world.tire 패키지 =============================
class 타이어 {
	
}
class 한국타이어 extends 타이어 {
	
}
class 넥센타이어 extends 타이어 {
	
}

// =================== com.world.car 패키지 =================================

@AllArgsConstructor
@Setter
@Getter
class Car {
	타이어 tire;
}

public class Liskov치환원칙Test4 {
	public static void main(String[] args) {
		Car car = new Car(new 한국타이어());
		System.out.println(car.getTire());
		car.setTire(new 넥센타이어());
		System.out.println(car.getTire());
	}
}
