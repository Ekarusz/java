package day3_07;

class Truck {
	public void truckDrive() {
		System.out.println("달려갑니다.");
	}
}

class Bus {
	public void busDrive() {
		System.out.println("달려갑니다.");
	}
}

public class OverrideTest1 {
	public static void main(String args[]) {
		Truck truck = new Truck();
		Bus bus = new Bus();
		truck.truckDrive();
		bus.busDrive();
	}
}
