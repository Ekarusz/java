package day3_05;

import lombok.*;

// ================== com.world.handPhone 패키지 =============================
class 핸드폰 {
	
}
class 삼성갤럭시 extends 핸드폰 {
	
}
class 아이폰 extends 핸드폰 {
	
}

// =================== com.world.saram 패키지 =================================

@AllArgsConstructor
@Setter
@Getter
class Saram {
	핸드폰 phone;
}

public class Liskov치환원칙Test3 {
	public static void main(String[] args) {
		Saram saram = new Saram(new 삼성갤럭시());
		System.out.println(saram.getPhone());
		saram.setPhone(new 아이폰());
		System.out.println(saram.getPhone());
	}
}
