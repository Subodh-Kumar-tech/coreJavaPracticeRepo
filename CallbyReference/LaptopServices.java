
class LaptopServices{

	public static void setDetail(Laptop x, String brand, double price){
		
		x.brand=brand;
		x.price=price;
		

	}

	public static String getDetail(Laptop x){


			return "Brand : "+x.brand+"\t Price : " +x.price;
	
	
	}




}
