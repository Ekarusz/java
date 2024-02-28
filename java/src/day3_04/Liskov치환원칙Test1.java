package day3_04;

import lombok.*;

// ================== com.world.handPhone 패키지 =============================
class 핸드폰 {
	
}
class 삼성갤럭시 extends 핸드폰 {
	
}
class 아이폰 extends 핸드폰 {
	
}

// =================== com.world.saram 패키지 =================================

@Setter
@Getter
class Saram {
	삼성갤럭시 phone1;
	아이폰 phone2;
}

public class Liskov치환원칙Test1 {
	public static void main(String[] args) {
		Saram saram = new Saram();
		saram.setPhone1(new 삼성갤럭시());
		System.out.println(saram.getPhone1());
		System.out.println(saram.getPhone2());
	}
}
