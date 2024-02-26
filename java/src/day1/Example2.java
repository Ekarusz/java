package day1;

// 기본 타입을 사용할 수 없는 경우에 wrapper class를 사용해 오류가 발생하지 않게 만든다
// wrapper class : 기본 타입을 객체로 포장해주는 클래스
// wrapper class 종류 :
// byte -> Byte, short -> Short, int -> Integer, long -> Long, float -> Float, double -> Double, char -> Charater, boolean -> Boolean
// 자바의 기본타입과 1:1인 클래스
// int는 Integer라는 객체가 있다
public class Example2 {
	public static void main(String[] args) {
		// a는 10이라는 값만 저장
		int a=10;
		
		// b는 값 이외에 여러 메소드를 가진 객체
		Integer b=new Integer(10);
		
		System.out.println(a);
		System.out.println(b.MAX_VALUE);
		
		// 웹에서 사용자가 값을 입력하지 않으면 서버는 null을 가지게 된다
		
		// 나이를 입력받는다면
		int x=null;
		Integer y=null;
		// 자바에서 null의 정의는 참조변수가 아직 가리키는 객체가 없다라는 뜻
		// 참조변수만이 값으로 null을 받을 수 있다
	}
}
