package day3_07;

class Vehicle2 {
	public void drive() {
		System.out.println("달려갑니다.");
	}
}

class Truck2 extends Vehicle2 {
}

class Bus2 extends Vehicle2 {
}

public class OverrideTest2 {
	public static void main(String args[]) {
		Vehicle2 truck = new Truck2();
		Vehicle2 bus = new Bus2();
		truck.drive();
		bus.drive();
	}
}
