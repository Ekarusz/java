package day3_06;
// 개방폐쇄원칙

//=== 동물
//=== Cat, Dog, Pig는 Animal로 대표된다
class Animal1 {
}
class Cat1 extends Animal1 {
}
class Dog1 extends Animal1 {
}
class Cow1 extends Animal1 {
}

//=== 수의사
//=== 동물의 외부 패키지에는 동물을 대표하는 Animal로 작업한다
class Hospital1 {
	public void 예방접종(Animal1 animal) {	
	}
}

public class 결론1 {
	public static void main(String[] args) {
		Hospital1 h = new Hospital1();
		h.예방접종(new Cat1());
		h.예방접종(new Dog1());
		h.예방접종(new Cow1());
	}
	
}