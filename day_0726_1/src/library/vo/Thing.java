package library.vo;

public class Thing {
	private int mNum;
	private String title;
	private int price;
	private int amount;
	
	public Thing() {
	}

	public Thing(int mNum, String title, int price, int amount) {
		super();
		this.mNum = mNum;
		this.title = title;
		this.price = price;
		this.amount = amount;
	}

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "mNum=" + mNum + ", title=" + title + ", price=" + price + ", amount=" + amount;
	}
	
	
	
	
}
