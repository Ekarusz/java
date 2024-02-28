package day3_06;

//=========== com.world.pet 패키지 ============================
class 고양이 {
	public void 야옹() {
		System.out.println("야옹 야옹 야~옹");
	}
}

class 강아지 {
	public void 멍멍멍() {
		System.out.println("멍멍멍 멍멍");
	}
}

// ========== com.world.병원 패키지 ============================
class 동물병원 {
	public void 주사(고양이 cat) {
		cat.야옹();
	}
	public void 주사(강아지 dog) {
		dog.멍멍멍();
	}
}


public class Liskov치환원칙Test5 {
	public static void main(String[] args) {
		동물병원 h = new 동물병원();
		h.주사(new 고양이());
		h.주사(new 강아지());
	}
}
