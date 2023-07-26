package library.vo;

public class Cd extends Thing {
	private String singer;
	
	public Cd() {
	}

	public Cd(int mNum, String title, int price, int amount , String singer) {
		super(mNum, title, price, amount);
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return super.toString()+", singer=" + singer;
	}
	
	
	
	
}
