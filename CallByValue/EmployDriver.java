class EmployDriver{

	public static void main(String[] args){

		System.out.println("main starts ");

		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();


		e1.setDetails(21, 25000);
		e2.setDetails(19, 21000);
		e3.setDetails(24, 28000);

		System.out.println("Details of Employ 1 is : "+ e1.getDetails());
		System.out.println("Details of Employ 2 is : "+ e2.getDetails());
		System.out.println("Details of Employ 3 is : "+ e3.getDetails());		


		System.out.println("main ends ");

	}
	



}
