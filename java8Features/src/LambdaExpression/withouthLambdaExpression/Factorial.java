package LambdaExpression.withouthLambdaExpression;

public class Factorial implements NumberOperation {

	public void getNumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(n + "! : " + fact);

	}

}
