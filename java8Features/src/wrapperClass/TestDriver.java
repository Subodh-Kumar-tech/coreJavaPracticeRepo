package wrapperClass;

public class TestDriver {
	public static void main(String[] args) {

		Test.process(10);
		Test.process(45.50);
		Test.process("Mohan");
		Test.process('c');
		Test.process('@');
		Test.process(true);
		Test.process(new Car("maruti", 55000));

	}
}
