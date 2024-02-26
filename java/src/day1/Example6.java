package day1;

import java.util.ArrayList;

// 향상된 for
public class Example6 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		// 향상된 for : js의 of, 파이썬의 int랑 같다
		// 꺼낼 타입과 같은 타입으로 설정해야함
		for(Integer ob : list1) {
			System.out.println(ob);
		}
		
		ArrayList list2=new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		// 자바의 모든 객체를 가리킬 수 있는 참조변수 타입이 Object이다
		for(Object ob:list2) {		// 타입을 Object로 쓰고 넘어갈수는 있지만 해결책은 아니다
			System.out.println(ob);
		}
		// 타입 설정이 안된 ArrayList를 쓰면 향상된 for문을 사용할 수 없다
	}
}
