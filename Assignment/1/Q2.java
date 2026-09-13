class Q2{
	public static void main(String[] args){
		System.out.println("================================================");

		double a=10, b=15, c=24;
		printAverage(a,b,c);

		System.out.println("================================================");
	}	

	public static void printAverage(double a, double b, double c){

		double avg = (a+b+c)/3;
		System.out.println("Average of " + a + " , "+ b+ " and " +c+ " is " + avg);
	}
	
}