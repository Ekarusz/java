package day3_07;

class Vehicle4 {
	public void drive() {
	}
}

class Truck4 extends Vehicle4 {
	public void drive() {
		System.out.println("트럭이 달려갑니다.");
	}
}

class Bus4 extends Vehicle4 {
	public void drive() {
		System.out.println("버스가 달려갑니다.");
	}
}

class Airplane4 extends Vehicle4 {
	public void drive() {
		System.out.println("비행기가 활주하면서 날아오릅니다");
	}
}

public class OverrideTest4 {
	public static void main(String[] args) {
		Vehicle4 v = new Airplane4();
		Truck4 v2 = new Truck4();
		
		v.drive();
		v2.drive();
	}
}
