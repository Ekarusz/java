package day2_4;

// 체력 : 40/40 -> 전투시에 40/28 -> 사망시에 40/0
public class Marine2 {
	// 전체체력은 모든 마린들이 공유한다
	// static은 거의 대부분이 public이다(정보은닉하지 않는다)
	// static을 안쓰면 에러가 나는게 아니지만, 메모리를 많이 사용하고 속도가 느려지기 때문에 static을 사용해 효율적인 코드 작성을 할 수 있다
	// static을 사용할 수 있다면 쓰는게 더 나은 코드 작성법이다
	public static Long 전체체력=40L;
	
	// 현재체력은 마린마다 다르다 -> 정보은닉
	private Long 현재체력;
	
	public Marine2() {
		현재체력=40L;
	}
}
