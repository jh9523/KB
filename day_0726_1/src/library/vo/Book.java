package library.vo;

public class Book extends Thing {
	private String publisher;
	
	public Book() {
	}

	public Book(int mNum, String title, int price, int amount ,String publisher) {
		super(mNum, title, price, amount);
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return super.toString()+", publisher=" + publisher;
	}
	
	
	
	
	
}
