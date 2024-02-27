package day2_4;

class Calc2 {
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
}

public class CalcTest {
	public static void main(String[] args) {
		Calc2 c1=new Calc2();
		Calc2 c2=new Calc2();
		// 객체를 만든다 -> 두 객체는 다르다
		// c1, c2의 객체의 동작은 항상 같다 -> 객체를 만들 필요가 없으니 만들지말고 static을 사용하자
		
		System.out.println(Calc2.sum(3, 4));
		System.out.println(Calc2.sub(3, 4));
	}
}
