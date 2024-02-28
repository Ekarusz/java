package day3_08;

class Vehicle1 {
	public void drive() {
	}
}

class Truck1 extends Vehicle1 {
	public void run() {
		System.out.println("트럭이 달려갑니다.");
	}
}

class Bus1 extends Vehicle1 {
	public void go() {
		System.out.println("버스가 달려갑니다.");
	}
}

class Airplane1 extends Vehicle1 {
	public void fly() {
		System.out.println("비행기가 활주하면서 날아오릅니다");
	}
}

public class 추상메소드Test1 {
	public static void main(String[] args) {
		Vehicle1 v = new Airplane1();
		Vehicle1 v2 = new Truck1();
		
		v.drive();
		v2.drive();
	}
}
