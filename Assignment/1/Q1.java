class Q1{
	public static void main(String[] args){

		double a=10, b=15;
		add(a,b);

		double x=23, y=12;
		substract(x,y);

		double p=23, q=34;
		multiplication(p,q);

		double m=34, n=2;
		Divide(m,n);

		System.out.println("================================================");
	}	

	public static void add(double a, double b){

		double sum = a+b;
		System.out.println("Sum of " + a + " and "+ b+ " is " + sum);
	}
	public static void substract(double x, double y){

		double sub=x-y;
		System.out.println("Substract of " + x + " and " + y + " is " + sub);

	}
	public static void multiplication(double p, double q){

		double multiply = p*q;
		System.out.println("Multiplication of " + p + " and "+ q+ " is " + multiply);
	}
	public static void Divide(double m, double n){

		double	divide=m/n;
		System.out.println("Divide of " + m + " and " + n + " is " + divide);

	}

}