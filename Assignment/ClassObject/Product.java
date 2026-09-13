class Product{

		int productId;
		String productName;
		int productQuantity;
		Double productPrice;
		

	public void setDetails(int productId, String productName, int productQuantity, Double productPrice){

			this.productId=productId;
			this.productName=productName;
			this.productQuantity=productQuantity;
			this.productPrice=productPrice;



		}

	public void printDetails(){

		 System.out.println("================================");

		System.out.println("productId is : " + productId);
		System.out.println("productName is : "+ productName);
		System.out.println("productQuantity is : "+ productQuantity);
		System.out.println("productPrice is : " + productPrice);

		System.out.println("================================");


		}

	public void totalAmount(){

		System.out.println("Total Amount is : " + productQuantity*productPrice);
	}


}