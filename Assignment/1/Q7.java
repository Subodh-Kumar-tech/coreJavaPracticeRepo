class Q7{
	public static void main(String[] args){
		System.out.println("================================================");

		double length = 20;
		double width = 40;
		
		printAreaAndPerimeterOfRectangle(length, width);

		System.out.println("================================================");
	}	

	public static void printAreaAndPerimeterOfRectangle(double length, double width){
		double area=length*width;
		double perimeter=2*(length+width);

		System.out.println("Area of Rectangle is " + area);
		System.out.println("Perimeter of Rectangle is " + perimeter);
	}
	
}