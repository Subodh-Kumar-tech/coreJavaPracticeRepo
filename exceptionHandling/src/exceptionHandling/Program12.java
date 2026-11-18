package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class Program12 {

	public static void main(String[] args) {

		String fileDetails = IO.readln("Enter the file details: ");
		try {
			test(fileDetails);
			System.out.println("File Craetion is successfull");
		} catch (IOException e) {

			System.out.println("File creation failed");
		} catch (Exception e) {
			System.out.println("Other exception caught");
		}
	}

	public static void test(String fileDetails) throws IOException, Exception {
		File f1 = new File(fileDetails);

		f1.createNewFile();// throw new IOException("File creation failed");
	}

}