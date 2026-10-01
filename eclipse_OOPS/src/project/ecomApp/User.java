package project.ecomApp;

public class User {

	public static void main(String[] args) {
		Order o = new Order();

		Product p = o.buy();

		p.use();
	}

}
