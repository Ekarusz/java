package day2_9;

// 상속 : 부모 것은 내 것
class 부모1 {
	int pmoney=100000;
}

// extends는 부모에에서 자식으로 상속 시켜주는 코드이다
class 자식1 extends 부모1 {
	int cmoney=50000;
}

public class 상속Test_1 {
	public static void main(String[] args) {
		자식1 ob=new 자식1();
		System.out.println(ob.pmoney);
		System.out.println(ob.cmoney);
	}
}
