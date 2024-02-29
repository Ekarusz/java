package day4_01;

import java.util.ArrayList;
import java.util.List;

class Monster {
}

class Oak extends Monster {
	private void tribe() {
		System.out.println("종족명은 오크");
	}
}
class Goblin extends Monster {
	private void tribe() {
		System.out.println("종족명은 고블린");
	}
}
class Zombie extends Monster {
	private void tribe() {
		System.out.println("종족명은 언데드");
	}
}


public class 리스코프치환원칙Test연습1 {
	public static void main(String[] args) {
		List<Monster> list=new ArrayList<>();
		
		list.add(new Oak());
		list.add(new Goblin());
		list.add(new Zombie());
		
		for(Monster m:list) {
			m.tribe();
		}
	}
}
