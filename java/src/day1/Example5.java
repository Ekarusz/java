package day1;

import java.util.ArrayList;

// for문 : 일반 for, 향상된 for(js의 of, python의 in과 같은 것임)
public class Example5 {
	public static void main(String[] args) {
		// 일반 for
		ArrayList list1=new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		// 개발자가 크기를 지정하면 안된다
		// 잘못 만든 코드임
		for(int i=0; i<3; i++) {
			System.out.println(list1.get(i));
		}
		
		// list1은 객체(Object)이다 -> 객체는 자기일은 자기가 알아서하는 S/W 부품이다
		// list1의 크기는 list1이 알고 있다
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
