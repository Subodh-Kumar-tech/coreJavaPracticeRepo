class Q8{
	public static void main(String[] args){
		System.out.println("================================================");

		double radius = 8;
				
		printAreaAndPerimeterOfCircle(radius);

		System.out.println("================================================");
	}	

	public static void printAreaAndPerimeterOfCircle(double radius){
		double area=3.14*radius*radius;
		double perimeter=2*3.14*radius;

		System.out.println("Area of Circle is " + area);
		System.out.println("Perimeter of Circle is " + perimeter);
	}
	
}