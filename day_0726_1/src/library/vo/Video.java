package library.vo;

public class Video extends Thing {
	private String Producer;
	
	public Video() {
	}

	public Video(int mNum, String title, int price, int amount , String producer) {
		super(mNum, title, price, amount);
		Producer = producer;
	}

	public String getProducer() {
		return Producer;
	}

	public void setProducer(String producer) {
		Producer = producer;
	}

	@Override
	public String toString() {
		return super.toString()+", Producer=" + Producer;
	}

	
	
}
