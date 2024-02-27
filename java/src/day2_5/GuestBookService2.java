package day2_5;

import java.util.ArrayList;

// 처리하는 클래스는 객체를 생성하지 않는다(생성할 필요가 없다)

public class GuestBookService2 {
	private static ArrayList<GuestBook2> list=new ArrayList<>();
	
	public static void save(GuestBook2 gb) {
		list.add(gb);
	}
	
	public static ArrayList<GuestBook2> findAll() {
		return list;
	}
	
	// 객체를 비교할 때는 ==이 아니라 equals메소드를 사용한다
	// 객체를 리턴하는 경우 실패하면 null을 리턴한다
	// 특정값을 읽어올 필요가 없는 경우 true/false를 리턴한다
	// 성공할 때 특정값을 읽어와야하는 코드인 경우에 실패할 때 null을 리턴한다
	// null : 가리키는 객체가 없다
	public static GuestBook2 findById(Long gno) {
		for(GuestBook2 gb:list) {
			if(gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null;
	}
	
	public static Boolean delete(Long gno) {
		return false;
	}
	
}
