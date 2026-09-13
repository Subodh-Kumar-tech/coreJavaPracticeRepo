class Q3{
	public static void main(String[] args){
		System.out.println("================================================");

		double price1=1400, discount1=20;
		printDiscountedPrice(price1, discount1);

		System.out.println("================================================");
	}	

	public static void printDiscountedPrice(double price1, double discount1){

		double discountPrice = price1*(100-discount1)/100;
		System.out.println("Discounted Price  of " + " price " + price1+ " And discount "+ discount1 + " is " + discountPrice);
	}
	
}