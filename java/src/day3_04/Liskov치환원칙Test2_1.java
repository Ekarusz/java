package day3_04;

import lombok.AllArgsConstructor;

// 부모의 참조변수는 자식을 가리킬 수 있다
// Phone p=new SS22();
// p=new S플립5();
class Phone {
}
// Phone 이라는 추상적인 부모 클래스를 만들고, Phone 보다는 상대적으로 구체적인 자식 클래스를 만들어 준다
// 추상적인 부모 클래스로 작업한다?
class SS22 extends Phone {
}
class SS23 extends Phone {
}
class SS24 extends Phone {
}
class S플립5 extends Phone {
}
class I아이폰14 extends Phone {
}
class I아이폰15 extends Phone {
}

@AllArgsConstructor
class Saram2 {
	private Phone phone;
}


public class Liskov치환원칙Test2_1 {
	public static void main(String[] args) {
		// 추상적인 부모 클래스로 작업해야 한다(코드 작성의 효율성이 월등히 좋아진다)
		Saram2 s=new Saram2(new I아이폰15());
	}
}
