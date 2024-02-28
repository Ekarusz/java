package day3_03;

// access modifier : protected

class Emp {
	protected String name;
	protected Long nai;
}

class Regular extends Emp {
	private String position;
	private Long salary;
	public Regular(String name, Long nai, String position, Long salary) {
		super.name = name;
		super.nai = nai;
		this.position = position;
		this.salary = salary;
	}
}

class PartTimer extends Emp {
	private String role;
	private Long 시급;
}

public class Test5 {

}
