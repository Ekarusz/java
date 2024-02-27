package day2_9;

// 자식의 공통점들을 모아서 부모 클래스를 만든다
// 부모를 상속받아 코드를 재사용하자
class Products {
	Long price=1000L;
}
class Paper extends Products {
	Long price=1000L;
	String name="종이";
	void 상품소개() {
		System.out.println(price + "원짜리" + name);
	}
}

class Ball extends Products {
	Long price=1000L;
	String name="공";
	void 상품소개() {
		System.out.println(price + "원짜리" + name);
	}
}
public class 상속Test2_1 {

}
