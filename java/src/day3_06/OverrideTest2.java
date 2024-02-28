package day3_06;

import java.util.ArrayList;
import java.util.List;

// 오버라이드 : 부모와 자식이 똑같은 메소드를 가질 때 자식것을 호출한다
//			  => 부모는 사용하는 방법을 통일시키고, 자식은 동작의 움직임을 다르게 만들어준다
//            => 부모는 메소드의 이름을 통일해준다
/*
 	부모의 참조변수로 작업한다
 	하지만 자식들의 동작은 자식마다 달라야한다
 	!!! 부모는 표준 -> 함수의 이름을 정해준다 !!!
 		탈것이 이동하는 방법은 go()야
 	자식들은 부모를 상속한다
 		Bus, Taxi, 비행기는 상속받아서 super.go()를 가지게 된다
 		이 상황에서 자식이 go()를 다시 만들면 this.go()를 실행한다
*/

// 부모는 사용하는 방법을 통일시킨다
class 탈것 {
	public void go() {
	}
}

// 자식은 동작의 움직임을 다르게 만들어준다
class Bus extends 탈것 {
	public void go() {
		System.out.println("버스가 달려갑니다");
	}
}
class Taxi extends 탈것 {
	public void go() {
		System.out.println("택시가 미터기켜고 달려갑니다");
	}
}
class 비행기 extends 탈것 {
	public void go() {
		System.out.println("비행기가 날아갑니다");
	}
}
public class OverrideTest2 {
	public static void main(String[] args) {
		List<탈것> list=new ArrayList<>();
		
		list.add(new Bus());
		list.add(new 비행기());
		list.add(new Taxi());
		
		for(탈것 v:list) {
			v.go();
		}
		// 부모를 다룰 수 있다면 모든 자식도 다룰 수 있다
		// 1. 부모가 인자인 함수는 모든 자식도 인자로 받을 수 있다
		// 2. 부모를 저장할 수 있다면 모든 자식도 저장할 수 있다
		
		

	}
}
// override 결론
// 1. 부모 클래스는 자식들을 묶는 표준의 역할을 한다
// 2. 부모 클래스는 자식들이 동작하는 방법(메소드)를 정해준다
// 3. 자식 클래스는 부모를 상속한 다음 부모의 메소드를 오버라이드한다
// 4. 이제 부모의 메소드를 호출하면 자식의 메소드가 실행된다
