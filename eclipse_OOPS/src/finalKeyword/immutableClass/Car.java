package finalKeyword.immutableClass;

public final class Car {

	private final String CARNO;
	private final String ENGINENO;
	private final double PRICE;

	Car(String CARNO, String ENGINENO, double PRICE) {
		this.CARNO = CARNO;
		this.ENGINENO = ENGINENO;
		this.PRICE = PRICE;

	}

	public void getCarNO() {
		System.out.println("car no : " + CARNO);
	}

	public void getEngineNO() {
		System.out.println("engine no : " + ENGINENO);
	}

	public void getPrice() {
		System.out.println("price : " + PRICE);
	}

	public String toString() {
		return "Car no : " + CARNO + "\tengine no : " + ENGINENO + "\tprice : " + PRICE;
	}

}
