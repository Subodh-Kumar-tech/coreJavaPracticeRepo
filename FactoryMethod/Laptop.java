class Laptop{

		String brand;
		int window;
		double price;
		
		
		
		public void setDetail(String brand, int window,double price){

		this.brand=brand;
		this.window=window;
		this.price=price;	
	
		}

		public String getDetail(){


			return "Brand : " + brand + "\tWindow : " + window + "\tPrice : " +price ;
		


		}

		static int count=0;

		{
			
			count++;
			
		}
}