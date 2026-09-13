class EmployService{

	
	public static Employ createEmployProfile(){

		String name = IO.readln("Enter Employ name : ");
		int age = Integer.parseInt(IO.readln("Enter Employ age : "));
		double salary = Double.parseDouble(IO.readln("Enter Employ salary : "));
		
		Employ e = new Employ(name, age,salary);
		
		return e;


}

	

}