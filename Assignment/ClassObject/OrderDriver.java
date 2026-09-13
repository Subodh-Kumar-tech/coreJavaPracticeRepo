class OrderDriver{

	public static void main(String[] args){


		Order O1 = new Order();
		
		O1.setDetails(101, "Watch", 4, 1200.5);
			
		O1.printDetails();

		O1.totalAmount();
}

}