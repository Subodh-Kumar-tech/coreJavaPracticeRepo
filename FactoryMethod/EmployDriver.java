import java.util.List;
import java.util.ArrayList;

class EmployDriver{

	public static void main(String[] args){

		
		
		List<Employ> l1 = new ArrayList<>();
	
		char choice;

		do{
			Employ e = EmployService.createEmployProfile();	
			l1.add(e);
			choice = IO.readln("Type Y/y if you want to create another employ : ").charAt(0);
		}while(choice=='Y' || choice=='y');
		
		for(Employ x : l1){

		System.out.println("name :" + x.name+"\t age : "+ x.age +"\t salary : "+ x.salary);

}
		System.out.println("The total object created is : " + Employ.count);


	}



}