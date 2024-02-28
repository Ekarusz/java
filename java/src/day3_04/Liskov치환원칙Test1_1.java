package day3_04;

// Liskov 치환 원칙(Liskov Substitution Principle) : "서브 타입은 언제나 기반 타입으로 교체될 수 있어야 한다"라는 원칙


// ======= 핸드폰 판매점(com.world.phone) ========
class 삼성갤럭시1 {
	
}
class 아이폰1 {
	
}

// ======= 사람(com.world.man) =======
class 사람 {
	private 삼성갤럭시1 phone1;
	private 아이폰1 phone2;
}



public class Liskov치환원칙Test1_1 {
	public static void main(String[] args) {
		
	}
}
