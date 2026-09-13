package singletonClass.synchronizedSingletonOrInitialization;

public class Employ {

	private static Employ p = new Employ();

	private Employ() {

	}

	public synchronized static Employ getInstance() {
		return p;
	}

	public void getDocument(String document) {
		System.out.println("Document : " + document);
	}

}
