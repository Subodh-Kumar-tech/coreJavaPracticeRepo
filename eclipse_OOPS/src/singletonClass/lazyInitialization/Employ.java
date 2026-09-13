package singletonClass.lazyInitialization;

public class Employ {

	private static Employ p = null;

	private Employ() {

	}

	public static Employ getInstance() {
		// lazy singleton/Initialization
		if (p == null) {
			p = new Employ();
		}
		return p;
	}

	public void getDocument(String document) {
		System.out.println("Document : " + document);
	}

}
