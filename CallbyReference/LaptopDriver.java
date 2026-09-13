
class LaptopDriver{

	public static void main(String[] args){


		System.out.println("main starts");
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();

		LaptopServices.setDetail(l1,"HP",50000);
		LaptopServices.setDetail(l2,"DELL",55800);
		LaptopServices.setDetail(l3,"ASUS",80000);


		System.out.println(" Details of Laptop l1 is :  " + LaptopServices.getDetail(l1));
		System.out.println(" Details of Laptop l2 is :  " + LaptopServices.getDetail(l2));
		System.out.println(" Details of Laptop l3 is :  " + LaptopServices.getDetail(l3));
		

	}




}
