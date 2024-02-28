package day3_01;

/*
	객체지향의 궁극적인 코드 재사용을 이용한 생산성 증가
	상속 : 객체의 모든 필드와 기능을 내가 재사용할 수 있다(코드를 재사용하는 개념)
	상속의 키워드 : extends
	A(자식) extends B(부모)
		자식 클래스 - sub class, derived class(파생 클래스)
		부모 클래스 - super class, base class
	자식은 부모의 모든 것을 포함한다(부모의 모든 것을 상속받아 자식이 부모를 포함할 수 있다)
*/

class MyCalc1 extends Calc1 {
	public int mul(int a, int b) {
		return a*b;
	}
}

public class MyCalcTest1 extends Calc1 {
	public static void main(String[] args) {
		MyCalc1 myCalc1=new MyCalc1();
		System.out.println(myCalc1.sum(10, 20));
		System.out.println(myCalc1.sub(20, 20));
	}
}
