package day3_03;

class 부모 {
	int pMoney = 1000000;
}

class 자식 extends 부모 {
	int cMoney = 50000;
	
	public void 재산신고() {
		System.out.println(this.pMoney);
		System.out.println(this.cMoney);
		System.out.println("=================");
		System.out.println(super.pMoney);
	}
}

public class Test4 {
	public static void main(String[] args) {
		new 자식().재산신고();
	}
}
