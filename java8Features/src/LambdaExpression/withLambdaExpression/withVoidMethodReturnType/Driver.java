package LambdaExpression.withLambdaExpression.withVoidMethodReturnType;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOperation square = (n) -> System.out.println(n * n);

		square.getNumber(5);

	}

}
