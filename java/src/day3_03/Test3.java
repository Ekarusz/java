package day3_03;

// 부모클래스의 생성자 super() 

class 사원 {
	private String name;
	private Long nai;
	public 사원(String name, Long nai) {
		this.name = name;
		this.nai = nai;
	}
}

class 정규직 extends 사원 {
	private String position;
	private Long salary;
	public 정규직(String name, Long nai, String position, Long salary) {
		super(name, nai);
		this.position = position;
		this.salary = salary;
	}
}


public class Test3 {
	public static void main(String[] args) {
		정규직 s1 = new 정규직("홍길동", 30L, "대리", 4000000L);
	}
}
