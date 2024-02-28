package day3_09;

import java.util.*;

//=========== com.world.pet 패키지 ============================
abstract class Pet {
	abstract public void cry();
}

class Cat extends Pet {
	public void cry() {
		System.out.println("야옹 야옹 야~옹");
	}
}

class Dog extends Pet {
	public void cry() {
		System.out.println("멍멍멍 멍멍");
	}
}

// ========== com.world.병원 패키지 ============================
// 다른 패키지의 상세 구현은 관심없다
// 동물을 대표하는 Pet 클래스 사용방법만 알면 된다

class Hospital {
	public void 주사(Pet pet) {
		pet.cry();
	}
}

public class Liskov치환원칙Test7 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Hospital h = new Hospital();
		
		h.주사(dog);
		h.주사(cat);
		System.out.println("============================================");
		
		List<Pet> 고객 = new ArrayList<>();
		고객.add(new Cat());
		고객.add(new Cat());
		고객.add(new Dog());
		고객.add(new Cat());
		
		for(Pet p:고객) {
			h.주사(p);
		}
	}
}
