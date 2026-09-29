package LambdaExpression.withLambdaExpression.withSomeReturnType;

public class Driver {
	public static void main(String[] args) {
		NumberOperation square = (n) -> n * n;
		int result = square.getNumber(5);
		System.out.println(result);
	}
}
