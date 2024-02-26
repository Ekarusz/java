package day1;

import java.util.ArrayList;

import javax.swing.JButton;

// for문 : 일반 for, 향상된 for
public class Example4 {
	public static void main(String[] args) {
		// 반복문을 사용하려면 데이터의 집합
		// 파이썬의 경우 데이터의 집합은 list, set, tuple, dictionary 이렇게 있다
		// 이런 집합들을 자바에서는 Collection 이라고 한다
		// 파이썬의 list는 자바스크립트에서는 배열이다
		// python : a=[1,3,5]
		// js : const a=[1,3,5];
		
		// 자바에서는 ArrayList 객체를 사용한다
		// import 방법 : Crtl + Shift + 알파벳 o
		// 아래 처럼 ArrayList를 만들면 list1은 아무거나 다 담을 수 있다
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add("Hello");
		list1.add(new JButton("클릭하세요"));
		
		// 담을 수 있는 값에 제한을 걸자 : Diamond 연산자
		// Diamond 연산자에 설정된 타입만 ArrayList에 담을 수 있다
		// ArrayList<타입> ~=new ArrayList<오른쪽은 타입 생략 가능>();
		// 아래의 ArrayList는 Diamond 연산자에 Integer를 설정해서 list2에 정수만 담을 수 있다
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add("Hello");		// list2에 정수가 아닌 글자가 담겨있어 오류가 발생한다
	}
}
