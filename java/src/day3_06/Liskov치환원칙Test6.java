package day3_06;

//=========== com.world.pet 패키지 ============================
class Pet {
}

class Cat extends Pet {
	public void 야옹() {
		System.out.println("야옹 야옹 야~옹");
	}
}

class Dog extends Pet {
	public void 멍멍멍() {
		System.out.println("멍멍멍 멍멍");
	}
}

// ========== com.world.병원 패키지 ============================
class Hospital {
	public void 주사(Pet pet) {
	}
}


public class Liskov치환원칙Test6 {
	public static void main(String[] args) {
	}
}
