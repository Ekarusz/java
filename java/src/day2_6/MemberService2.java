package day2_6;

import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;

public class MemberService2 {
	private static ArrayList<Member2> list=new ArrayList<>();
	// 아이디 사용가능
	public static Boolean 아이디사용가능(String username) {
		for(Member2 m:list) {
			if(m.getUsername().equals(username)) {
				return false;
			}
		}
		return true;
	}
	
	// 회원가입
	public static void 조인(Member2 member) {
		list.add(member);
	}
	
	// 아이디 찾기
	public static String 아이디찾기(String email) {
		for(Member2 m:list) {
			if(m.getEmail().equals(email)) {
				return m.getUsername();
			}
		}
		return null;
	}
	
	// 비밀번호 찾기 -> 임시비밀번호 발급
	// maven으로 pom.xml에 apache commons lang 추가
	public static String 비밀번호찾기(String username) {
		for(Member2 m:list) {
			if(m.getUsername().equals(username)) {
				// RandomStringUtils.randomAlphanumeric(20) => 랜덤한 20글자(알파벳) 생성
				return RandomStringUtils.randomAlphanumeric(20);
				}
			}
		return null;
	}
	
	// 로그인
	public static Boolean 로그인(String username, String password) {
		for(Member2 m:list) {
			if(m.getUsername().equals(username) && 
					m.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	// 내정보
	public static Member2 내정보(String username) {
		for(Member2 m:list) {
			if(m.getUsername().equals(username)) {
				return m;
			}
		}
		return null;
	}
	
	// 비밀번호 변경
	public static Boolean 비밀번호변경(String username, String password, String 새비밀번호) {
		for(Member2 m:list) {
			if(m.getUsername().equals(username) && 
					m.getPassword().equals(password)) {
				m.setPassword(새비밀번호);
				return true;
			}
		}
		return false;
	}
}
