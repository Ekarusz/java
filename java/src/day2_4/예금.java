package day2_4;

import lombok.*;

@Getter
public class 예금 {
	public static Double 기본금리 = 2.0;
	private Double 우대금리;
	private Double 적용금리;
	
	public 예금() {
		우대금리 = 0.0;
		적용금리 = 기본금리 + 우대금리;
	}
	
	public 예금(Double 우대금리) {
		this.우대금리 = 우대금리;
		this.적용금리 = 기본금리 + 우대금리;
	}
}
