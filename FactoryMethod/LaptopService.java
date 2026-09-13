class LaptopService{


		public static Laptop createNewLaptop(){

			String brand = IO.readln("Enter your Laptop brand : ");
			int window = Integer.parseInt(IO.readln("Enter your Laptop window : "));
			double price = Double.parseDouble(IO.readln("Enter Laptop price : "));

			Laptop l = new Laptop();
			l.setDetail(brand, window, price);
			
			return l;





		}

	

}