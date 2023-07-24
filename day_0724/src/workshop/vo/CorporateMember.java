package workshop.vo;

public class CorporateMember extends Member {
	private String cName;	// 회사 이름
	private int rNum;	// 법인 등록번호
	
	public CorporateMember() {
	}

	public CorporateMember(int membnum, String pType, String phone, String cName, int rNum) {
		super(membnum, pType, phone);
		this.cName = cName;
		this.rNum = rNum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
	}
	
	public String people() {
		return "법인회원";
	}

	@Override
	public String toString() {
		return super.toString()+"cName=" + cName + ", rNum=" + rNum;
	}
	
	
	
	
	
}
