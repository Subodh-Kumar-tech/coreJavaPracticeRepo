class Q10{
	public static void main(String[] args){
		System.out.println("================================================");

		double radius = 8;
		double height = 10;
				
		printVolumeOfCylinder(radius,height);

		System.out.println("================================================");
	}	

	public static void printVolumeOfCylinder(double radius, double height){
		double volumeOfCylinder=3.14*radius*radius*height;
		

		
		System.out.println("Volume of Cylinder"+ volumeOfCylinder);
	}
	
}