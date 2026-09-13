package constructor.deepCopyConstructor;

public class Address {

	
	String city;
	String state;
	int pin;
	
	
	Address(){
		
	}
	
	Address(String city, String state, int pin){
		this.city=city;
		this.state=state;
		this.pin=pin;
	}
	
	public String toString() {
		return "City : "+city+"\tState : "+state+"\tPin : "+pin;
		
	}
	
	
	
}
