package day3_03;

// access modifier : public, private, protected
class Emp1 {
	// protected로 설정하면 부모 클래스에서 생성자를 따로 만들지 않아도 된다?
	protected String name;
	protected Long nai;
}

// 부모의 private에는 자식은 접근할 수 없다
// protected는 자식의 접근은 허용
class Regular1 extends Emp1 {
	private String position;
	private Long salary;
	public Regular1(String name, Long nai, String position, Long salary) {
		super.name=name;
		super.nai=nai;
		this.position=position;
		this.salary=salary;
	}
	}
}

public class Test5_1 {
	public static void main(String[] args) {
		Regular1 s1=new Regular1("홍길동",30L,"대리",4000000L);
	}
}