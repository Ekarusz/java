package day3_08;

import java.util.*;

abstract class Shape {
	// 부모 클래스의 메소드는 오버라이딩하라고 만든 메서드
	abstract void draw();
}

class Circle extends Shape {
	void draw() {
		System.out.println("원을 그립니다");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("삼각형을 그립니다");
	}
}

class Rect extends Shape {
	void draw() {
		System.out.println("사각형을 그립니다");
	}
}

public class 추상메소드Test4 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Rect());
		list.add(new Triangle());
		
		for(Shape s:list) {
			s.draw();
		}
	}
}
