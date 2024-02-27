package day2_9;

class Product {
	protected Long price = 1000L;
}

class Pen extends Product {
	private String name = "펜";
	public void 제품정보() {
		System.out.println("제품이름 : " + name + ", 가격 :" + price);
	}
}

class Note extends Product {
	private String name = "노트";
	public void 제품정보() {
		System.out.println("제품이름 : " + name + ", 가격 :" + price);		
	}
}

public class 상속Test2 {

}
