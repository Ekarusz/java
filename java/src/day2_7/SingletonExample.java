package day2_7;

public class SingletonExample {
	private static SingletonExample ob = new SingletonExample();
	
	private SingletonExample() {
	}
	
	public static SingletonExample getInstance() {
		return ob;
	}
}
