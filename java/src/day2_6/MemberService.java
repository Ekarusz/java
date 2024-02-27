package day2_6;

import java.util.*;

public class MemberService {
	private static ArrayList<Member> list = new ArrayList<>();
	
	public static Boolean 아이디사용가능(String username) {
		for(Member m:list) {
			if(m.getUsername().equals(username)==true) {
				return false;
			}
		}
		return true;
	}
	
	public static void 회원가입(Member member) {
		list.add(member);
	}
	
	public static String 아이디찾기(String email) {
		for(Member m:list) {
			if(m.getEmail().equals(email)==true) {
				return m.getPassword();
			}
		}
		return null;
	}
	
	public static Boolean login(String username, String password) {
		for(Member m:list) {
			if(m.getUsername().equals(username)==true && m.getPassword().equals(password)==true) {
				return true;
			}
		}
		return false;
	}
}
