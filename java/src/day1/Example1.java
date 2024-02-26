package day1;

public class Example1 {
	public static void main(String[] args) {
		// 기본타입은 값을 가지는 타입이고, 객체들은 값을 가지지 않는 타입이다
		// 객체들을 사용하여 간접조작한다
		
		// 타입
		// 1. 기본타입 : 정수, 문자, 실수, 참거짓
		// 정수 : int(4바이트 : -21억~21억), long(8바이트 : -920경~920경)
		// 정수는 크기가 커지면 표현할 수 있는 범위가 넓어진다
		// 정수를 대표하는 타입은 long이다(요즘 스타일의 코드들은 다 long을 쓴다)
		int a=10;
		long b=20;
		
		// 실수 :float, double
		// 실수를 대표하는 타입은 double이다
		// 실수는 크기가 커지면 정밀해진다(실수는 근사값이다)
		float f=10;
		double d=10;
		
		// 문자열 : char
		// 문자형은 글자 1글자를 저장한다 -> 거의 사용하지 않음(사실상 죽은 타입이다)
		char ch='A';
		
		// 참거짓 : boolean -> true/false
		boolean isChild=false;
		
		// 2. 참조변수 : 객체를 가리키는 4바이트 리모콘
		// 			   객체 자체는 이름이 없다(객체의 값을 가진다)
		//			   참조변수로 작업한다
		String str="Hello";		// 객체의 이름이 없고 69609650라는 객체의 번호만 가진다
		System.out.println(str.hashCode());
	}
}
