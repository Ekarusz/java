package day2_9;

class Parent {
	int a = 10;
}

class Child extends Parent {
	int b = 20;
}

public class 상속Test {
	public static void main(String[] args) {
		Child ob = new Child();
		System.out.println(ob.a);
		System.out.println(ob.b);
	}
}
