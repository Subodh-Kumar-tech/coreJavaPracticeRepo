class Fruit{

	String name;
	int price;
	Double weight;



	public void setDetail(String name, int price, Double weight){

				this.name = name;
				this.price= price;
				this.weight= weight;



		}
	public void getDetail(){
				
				System.out.println("================================");
				System.out.println("Fruit Name is : " + name);
				System.out.println("Fruit price is : " + price);
				System.out.println("Fruit weight is : " + weight);
				System.out.println("================================");
}



	public void totalPrice(){

				System.out.println("Total price is : " + price*weight);
}


}