// Static and Non Static Initializer Block

class A{

	static int x=0;
	static {
		x=5;
		
		System.out.println("in class A static block-1");
		System.out.println("value of x is " + x);
	}

}


class B{


	int y =0;
	{
		System.out.println("int class B non-static block-2");
		y=8;
		System.out.println("value of y is : " +y);

	}
	
	}



public class Demo{
	
	static {
	
		System.out.println("int static block-1");
	
	}


	public static void main(String[] args){

		
	System.out.println("in main block");

	A obj1 = new A();
	B obj2 = new B();
	
	System.out.println(" value of x is in main is : " + obj1.x);
	System.out.println(" value of x is in main is : " + obj2.y);
	System.out.println(" value of x is in main is : " + obj1.x);
	
	}


	static{

		System.out.println("in static block-2");
	
	}

}
