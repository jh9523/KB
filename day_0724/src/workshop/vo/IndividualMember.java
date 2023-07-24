package workshop.vo;

public class IndividualMember extends Member {

	private String name;	// 개인회원 이름
	
	public IndividualMember() {
	}

	public IndividualMember(int membnum, String pType, String phone ,String name) {
		super(membnum, pType, phone);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String people() {
		return "개인회원";
	}

	@Override
	public String toString() {
		return super.toString()+", name=" + name;
	}
	
	
	
}
