package day3_03;

// this(내재산) = this + super
// 내가 전세를 구했는데 부모님이 5000만원, 내가 5000만원을 냈다
// 내 재산이 1억인데 나눠보면 this 5000, super 5000

// this는 순수한 내 것, super는 물려받은 것 이라고 생각하면 편하다

class 부모1 {
	int pMoney=1000000;
}

class 자식1 extends 부모1 {
	int cMoney=50000;
	
	public void 재산신고() {
		System.out.println(this.pMoney);
		System.out.println(this.cMoney);
		System.out.println("============");
		System.out.println(super.pMoney);
	}
}

public class Test4_1 {
	public static void main(String[] args) {
		new 자식1().재산신고();
	}
}
