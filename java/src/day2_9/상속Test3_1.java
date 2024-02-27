package day2_9;

// 상속의 활용
class Parent3 {
	int a;
}
class Child3 extends Parent3 {
	int b;
}

// 자식은 부모에게 상속받은 상태이기 때문에 자식 내부에 있는 부모를 부모가 가리킬 수 있다
public class 상속Test3_1 {
	public static void main(String[] args) {
		// 엄청 중요한 개념이다!!
		// 1. 부모의 참조변수는 자식을 가리킬 수 있다
		// 엄밀히 말하면 ob1은 자식 자체가 아닌 자식 내부의 부모를 가리킨다
		Parent3 ob1=new Child3();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		
		// 역은 불가능
		Child3 ob2=new Parent3();
		
		Child3 ob3=new Child3();
		System.out.println(ob3.a);
		System.out.println(ob3.b);
		
		// 왜 부모로 자식을 가리키지? 다음 예제에서
	}
}
