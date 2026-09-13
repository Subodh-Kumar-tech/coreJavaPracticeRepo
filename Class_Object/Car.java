 class Car{
		static int x=20;
		int y = 50;


	public static void start(){
		System.out.println("in start");
		Car obj1 = new Car();
		System.out.println("x is : " + obj1.x);
	}


	public static void main(String[] args){

				System.out.println("in main");
				Car.start();
				Car obj = new Car();
				obj.drive();
			
	}

	public void drive(){
		System.out.println("in drive");
	}

}