package day2_9;

class 부모 {
	protected Long money = 1000000L;
}

class 자식 extends 부모 {
	private Long money = 500000L;
	
	public void printMoney() {
		System.out.println(money);
		System.out.println(super.money);
	}
}

public class 상속Test3 {
	public static void main(String[] args) {
		자식 ob = new 자식();
		ob.printMoney();
	}
}
