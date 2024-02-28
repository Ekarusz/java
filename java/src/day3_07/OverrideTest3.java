package day3_07;

class Vehicle3 {
	public void drive() {
		System.out.println("달려갑니다.");
	}
}

class Truck3 extends Vehicle3 {
}

class Bus3 extends Vehicle3 {
}

class Airplane3 extends Vehicle3 {
	
}
public class OverrideTest3 {
	public static void main(String[] args) {
		Vehicle3 v = new Airplane3();
		// ?????
		v.drive();
	}
}
