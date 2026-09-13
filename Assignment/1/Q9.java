class Q9{
	public static void main(String[] args){
		System.out.println("================================================");

		double side = 8;
				
		printAreaAndPerimeterOfSquare(side);

		System.out.println("================================================");
	}	

	public static void printAreaAndPerimeterOfSquare(double side){
		double area=side*side;
		double perimeter=4*side;

		System.out.println("Area of Square is " + area);
		System.out.println("Perimeter of Square is " + perimeter);
	}
	
}