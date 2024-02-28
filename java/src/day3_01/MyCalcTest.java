package day3_01;

/*
	상속은 기능의 확장
*/

class MyCalc extends Calc {
	public int mul(int a, int b) {
		return a*b;
	}
}

public class MyCalcTest extends Calc {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc();
		System.out.println(myCalc.sum(10, 20));
		System.out.println(myCalc.mul(20, 20));
	} 
}
