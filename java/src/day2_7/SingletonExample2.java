package day2_7;

// 디자인 패턴
// Builder : 객체 생성의 난해함에 대처
// Singleton : 객체를 하나만 생성
// 			   모든 멤버가 static인 클래스와 목적은 동일

public class SingletonExample2 {
	// 1. private 생성자로 new를 금지한다(외부에서 객체를 생성하지 못하게 금지함)
	private SingletonExample2() {
	}
	
	// 2. 자기자신의 static 필드를 가진다(내부에서 객체를 생성함)
	private static SingletonExample2 ob=new SingletonExample2();
	
	// 3. 필드를 빌려주는 메소드를 추가한다(@Getter로도 읽어올 수 없기 때문에 필드를 빌려주는 getInstance()라는 메소드를 추가해서 사용한다?)
	public static SingletonExample2 getInstance() {
		return ob;
	}
}
