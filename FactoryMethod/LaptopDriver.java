import java.util.List;
import java.util.ArrayList;



class LaptopDriver{


	public static void main(String[] args){
		
				
		System.out.println();		

		List<Laptop> l1 = new ArrayList<>();


		char choice;
		
		do{

			Laptop l = LaptopService.createNewLaptop();
		
			l1.add(l);
			System.out.println();
			choice = IO.readln("Type Y/y  If you want to create one more Laptop : ").charAt(0); 
			System.out.println();



		}while(choice=='Y' || choice == 'y');

		System.out.println();
		for(Laptop x : l1){
		
		
		System.out.println(x.getDetail());
	
	
		
		}	

	

		
		System.out.println();
		System.out.println("The total object created is : " + Laptop.count);




	}


}