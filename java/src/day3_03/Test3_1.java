package day3_03;

// 부모클래스의 생성자 super()
// super() : 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하기 위해 사용된다
// 객체지향 구성요소(고전)
//  1. 캡슐화 : 클래스를 만들어라
//  2. 정보은닉 : 가능한한 private로 만들어라(케이스를 씌워라)
//  3. 상속
//  4. 다형성

// 객체지향 원칙(SOLID)
//  S : 단일책임원칙 - 객체는 자기일만 알아서하면 된다(객체는 각자의 역할만 하면 된다)
//  O
//  L
//  I
//  D


// 부모 클래스
class 사원1 {
	private String name;
	private Long nai;
	public 사원1(String name, Long nai) {
		this.name=name;
		this.nai=nai;
	}
}

// 자식 클래스
class 정규직1 extends 사원1 {
	private String position;
	private Long salary;
	public 정규직1(String name, Long nai, String position, Long Salary) {
		// super(); 를 사용하여 부모 클래스에 있는 생성자를 호출함
		// 생성자 호출은 생정자의 첫 줄에서만 가능하다
		super(name,nai);
		this.position=position;
		this.salary=salary;
	}
}

public class Test3_1 {
	public static void main(String[] args) {
		정규직1 s1=new 정규직1("홍길동",30L,"대리",4000000L);
	}
}