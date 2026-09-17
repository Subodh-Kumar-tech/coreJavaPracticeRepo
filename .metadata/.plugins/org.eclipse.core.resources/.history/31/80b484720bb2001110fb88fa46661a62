package fileHandling;

import java.io.FileReader;

public class Program2 {

	public static void main(String[] args) {
		// file reader

		try (FileReader fr = new FileReader("fileWriter.txt");) {
			String result = fr.readAllAsString();
			System.out.println(result);
			System.out.println("file reader successful");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
