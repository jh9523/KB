package workshop.vo;
//개인회원: 회원번호,회원타입(개인,법인),회원이름,연락처
public class Member {
	private int membnum;	// 회원번호
	private String pType;	// 회원타입(개인, 법인)
	private String phone;	// 연락처
	
	public Member() {
	}

	public Member(int membnum, String pType, String phone) {
		super();
		this.membnum = membnum;
		this.pType = pType;
		this.phone = phone;
	}

	public int getMembnum() {
		return membnum;
	}

	public void setMembnum(int membnum) {
		this.membnum = membnum;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String people() {
		return "";
	}

	@Override
	public String toString() {
		return "[membnum=" + membnum + ", pType=" + pType + ", phone=" + phone + "]";
	}
	
	
}
