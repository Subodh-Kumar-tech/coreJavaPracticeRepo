class Employ{

	String name;
	int age;
	double salary;

	Employ(){

	}

	Employ(String name, int age, double salary){
	
	this.name=name;
	this.age=age;
	this.salary=salary;
	
	}

	static int count=0;
	{
	
		count++;
		//System.out.Prinln("Employ object " + count+" is created");

	}




}