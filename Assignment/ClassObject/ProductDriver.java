class ProductDriver{

	public static void main(String[] args){
		
		Product P1 = new Product();

		P1.setDetails(101, "Watch", 4, 1200.5);
		P1.printDetails();
		P1.totalAmount();
}


}