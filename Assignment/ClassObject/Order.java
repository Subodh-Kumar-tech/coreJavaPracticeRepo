class Order{

		int orderId;
		String orderName;
		int orderQuantity;
		Double orderPrice;
		

	public void setDetails(int OrderId, String OrderName, int OrderQuantity, Double OrderPrice){

			this.orderId=orderId;
			this.orderName=orderName;
			this.orderQuantity=orderQuantity;
			this.orderPrice=orderPrice;



		}

	public void printDetails(){

		 System.out.println("================================");

		System.out.println("OrderId is : " + orderId);
		System.out.println("OrderName is : "+ orderName);
		System.out.println("OrderQuantity is : "+ orderQuantity);
		System.out.println("OrderPrice is : " + orderPrice);

		System.out.println("================================");


		}

	public void totalAmount(){

		System.out.println("Total Amount is : " + orderQuantity*orderPrice);
	}


}								