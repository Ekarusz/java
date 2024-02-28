package day3_05;

import java.util.ArrayList;
import java.util.List;

// 객체지향 구성요소
// 1. 캡슐화
// 2. 정보은닉
// 3. 상속
//    시작은 재사용이었으나 현실은 부모의 참조변수로 작업한다
// 4. 다형성 - 같은 이름의 메소드가 상황에 따라 동작이 달라진다
//    overload : 메소드의 이름이 같고 인자는 다르다(이름만 같고 다른 메소드)
//    override : 똑같은 메소드(리턴, 이름, 인자 모두 같다) - 상속이 전제조건이다(상속이 없이는 override가 존재하지 않는다)

class 탈것 {
	
}

class Truck extends 탈것 {
	public void drive() {
		System.out.println("트럭이 달려갑니다");
	}
}
class Bus extends 탈것 {
	public void go() {
		System.out.println("버스가 달려갑니다");
	}
}
class 트럭 {
}
class 버스 {
}

public class OverrideTest1_1 {
	public static void main(String[] args) {
		// 부모클래스 : 추상적인 분류(abstract class)
		// 자식클래스 : 구체적인 실체(concrete class, 구상 클래스)
		탈것 v=new Bus();
		탈것 v2=new Truck();
		List<탈것> list=new ArrayList<>();
		list.add(new Truck());
		list.add(new Bus());
		// list에서 원소를 꺼내면 탈것
		
		List list2=new ArrayList<>();
		list2.add(new 트럭());
		list2.add(new 버스());
		// list2에서 원소를 꺼내면 Object 객체가 된다
		// Object 객체 : 자바에서 오류를 막기 위해 "모든 객체의 부모다" 라고 만들어 놓은 개념
		// Object 객체는 실제로 작업하는 객체는 아니다
	}
}
