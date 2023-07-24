package workshop.vo;

public class Truck extends Car {
	private int jim;	// 적재량
	
	public Truck() {
	}

	public Truck(int carnum, int price, String type, int year, int bae, int jim) {
		super(carnum, price, type, year, bae);
		this.jim = jim;
	}

	public int getJim() {
		return jim;
	}

	public void setJim(int jim) {
		this.jim = jim;
	}

	@Override
	public String rent() {
		return "트럭";
	}

	@Override
	public String toString() {
		return super.toString()+", jim=" + jim;
	}
	
	

}
