
class EmployDriver{

	public static void main(String[] args){


		System.out.println("main starts");
		
		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();

		EmployServices.setDetail(e1, 25, 54698);
		EmployServices.setDetail(e2, 22, 241850);
		EmployServices.setDetail(e3, 28, 54000);
		

		System.out.println("Details of Employ 1 is -> " + EmployServices.getDetail(e1));
		System.out.println("Details of Employ 2 is -> " + EmployServices.getDetail(e2));
		System.out.println("Details of Employ 3 is -> " + EmployServices.getDetail(e3));




	}




}
