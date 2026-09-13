package constructor.copyConstructor;

public class Employ {

	String name;
	int empId;
	Address a;
	
	
	Employ(){
		
		
	}
	
	Employ(String name, int empId, Address a){
		this.name=name;
		this.empId=empId;
		this.a=a;
		
	}
	
	Employ(Employ x){
		
		this(x.name,x.empId,x.a);
		
		
		
	}
	
	public String toString() {
		return "Name : "+name+"\tEmpId :"+empId+"\tAddress [ City : "+a.city+"\tState : "+a.state+" \tPin : "+a.pin+" ]";
		
	}
	
	
	
}
