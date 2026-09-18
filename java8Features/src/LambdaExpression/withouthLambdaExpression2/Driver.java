package LambdaExpression.withouthLambdaExpression2;

public class Driver {

	public static void main(String[] args) {

		NumberOperation square = new NumberOperation() {
			public void getNumber(int n) {
				System.out.println("Square of " + n + " : " + n * n);
			}
		};
		NumberOperation factorial = new NumberOperation() {
			public void getNumber(int n) {
				int fact = 1;
				for (int i = 1; i <= n; i++) {
					fact *= i;
				}
				System.out.println(n + "! : " + fact);
			}
		};

		square.getNumber(5);
		factorial.getNumber(10);

	}

}
