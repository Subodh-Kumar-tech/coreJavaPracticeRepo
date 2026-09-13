package singletonClass.eagerInitialization;

public class Employ {

	private static Employ p = new Employ();

	private Employ() {

	}

	public static Employ getInstance() {

		// Eager singleton
		return p;
	}

	public void getDocument(String document) {
		System.out.println("Document : " + document);
	}

}
