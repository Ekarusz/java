package day1;

// if문
public class Example3 {
	public static void main(String[] args) {
		int nai=35;
		if(nai>=65) {
			System.out.println("무료");
		} else if(nai>=25) {
			System.out.println("대인(3000원)");
		} else {
			// else는 조건을 적지 않는다(don't care)
			// else 조건이 쉽게(명확하게) 보일때 사용
			System.out.println("무료");
		}
	}
}
