class Laptop{

	String brand;
	int window;
	double price;

	Laptop(){

	System.out.println("This is new Laptop");


	}

	Laptop(String brand){
	
	this.brand=brand;
	
	}
	
	Laptop(String brand, int window, double price){


	this.brand = brand;
	this.window = window;
	this.price = price;

	}

	public String toString(){

	return "Brand : " + brand + "\t Window : " + window + "\t Price : " + price;



	}



}