package library.vo;
// 대여(대여번호, 회원id, 대여할물건관리번호, 대여년월일, 대여시분, 반납년월일, 반납시분)

public class Rent {
	private int rentNum;
	private String id;
	private int mNum;
	private String rentYMD;
	private String rentHM;
	private String returnYMD;
	private String returnHM;
	
	public Rent() {
	}

	public Rent(int rentNum, String id, int mNum, String rentYMD, String rentHM, String returnYMD, String returnHM) {
		super();
		this.rentNum = rentNum;
		this.id = id;
		this.mNum = mNum;
		this.rentYMD = rentYMD;
		this.rentHM = rentHM;
		this.returnYMD = returnYMD;
		this.returnHM = returnHM;
	}

	public int getRentNum() {
		return rentNum;
	}

	public void setRentNum(int rentNum) {
		this.rentNum = rentNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public String getRentYMD() {
		return rentYMD;
	}

	public void setRentYMD(String rentYMD) {
		this.rentYMD = rentYMD;
	}

	public String getRentHM() {
		return rentHM;
	}

	public void setRentHM(String rentHM) {
		this.rentHM = rentHM;
	}

	public String getReturnYMD() {
		return returnYMD;
	}

	public void setReturnYMD(String returnYMD) {
		this.returnYMD = returnYMD;
	}

	public String getReturnHM() {
		return returnHM;
	}

	public void setReturnHM(String returnHM) {
		this.returnHM = returnHM;
	}

	@Override
	public String toString() {
		return "rentNum=" + rentNum + ", id=" + id + ", mNum=" + mNum + ", rentYMD=" + rentYMD + ", rentHM="
				+ rentHM + ", returnYMD=" + returnYMD + ", returnHM=" + returnHM;
	}
	
	
	
}
